package com.caps.scb.streams;

import java.io.IOException;
import java.util.Collections;
import java.util.Properties;
import java.util.concurrent.CountDownLatch;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.KStream;

import com.fasterxml.jackson.databind.ser.std.StringSerializer;


import kafka.admin.AdminClient;
import kafka.consumer.ConsumerConfig;
import kafka.producer.ProducerConfig;
import kafka.server.KafkaConfig;
import kafka.server.KafkaServerStartable;
import kafka.zk.EmbeddedZookeeper;

import java.nio.file.Files;


public class KafkaExampleFull {
	
    public static void main(String[] args) throws IOException {
        final String bootstrapServers = "localhost:9092";
        final String inputTopic = "input-topic";
        final String outputTopic = "output-topic";

        // Start Zookeeper
        String zkTmpDir = Files.createTempDirectory("zookeeper").toAbsolutePath().toString();
        EmbeddedZookeeper embeddedZookeeper = new EmbeddedZookeeper();
        embeddedZookeeper.start();

	        // Start Kafka
	        String kafkaTmpDir = Files.createTempDirectory("kafka").toAbsolutePath().toString();
	        Properties brokerProps = new Properties();
	        brokerProps.setProperty("listeners", "PLAINTEXT://localhost:9092");
	        brokerProps.setProperty("log.dirs", kafkaTmpDir);
	        brokerProps.setProperty("auto.create.topics.enable", "true");
	        KafkaConfig kafkaConfig = new KafkaConfig(brokerProps);
	        KafkaServerStartable kafkaServer = new KafkaServerStartable(kafkaConfig);
	        kafkaServer.startup();

	        // Create topics
	        Properties adminProps = new Properties();
	        adminProps.setProperty(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
	        try (AdminClient adminClient = AdminClient.create(adminProps)) {
	            NewTopic newTopic = new NewTopic(inputTopic, 1, (short) 1);
	            adminClient.createTopics(Collections.singletonList(newTopic));
	        }

	        // Producer
	        Properties producerProps = new Properties();
	        producerProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
	        producerProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
	        producerProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
	        KafkaProducer<String, String> producer = new KafkaProducer<>(producerProps);

	        // Send test message to input topic
	        producer.send(new ProducerRecord<>(inputTopic, "key", "test message"));

	        // Consumer
	        Properties consumerProps = new Properties();
	        consumerProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
	        consumerProps.put(ConsumerConfig.GROUP_ID_CONFIG, "group-id");
	        consumerProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
	        consumerProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
	        consumerProps.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
	        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(consumerProps);
	        consumer.subscribe(Collections.singletonList(inputTopic));

	        // Seek to specific offset
	        consumer.poll(0); // Ensure consumer is assigned partitions
	        consumer.seekToBeginning(consumer.assignment());

	        // Set up Kafka Streams properties
	        Properties streamsConfig = new Properties();
	        streamsConfig.put(StreamsConfig.APPLICATION_ID_CONFIG, "kafka-streams-example");
	        streamsConfig.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
	        streamsConfig.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
	        streamsConfig.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());

	        // Create a StreamsBuilder
	        StreamsBuilder builder = new StreamsBuilder();

	        // Define the stream processing topology
	        KStream<String, String> inputStream = builder.stream(inputTopic);
	        KStream<String, String> outputStream = inputStream.mapValues(String::toUpperCase);
	        outputStream.to(outputTopic);

	        // Build the topology
	        Topology topology = builder.build();

	        // Create and start the KafkaStreams instance
	        KafkaStreams streams = new KafkaStreams(topology, streamsConfig);
	        final CountDownLatch latch = new CountDownLatch(1);
	        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
	            streams.close();
	            producer.close();
	            consumer.close();
	            kafkaServer.shutdown();
	            embeddedZookeeper.stop();
	            latch.countDown();
	        }));
	        try {
	            streams.start();
	            while (true) {
	                consumer.poll(Long.MAX_VALUE);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	            System.exit(1);
	        } finally {
	            streams.close();
	            producer.close();
	            consumer.close();
	            kafkaServer.shutdown();
	            embeddedZookeeper.stop();
	            latch.countDown();
	        }
	    }
	}



