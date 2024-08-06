package com.codedecode.KafkaDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

//	@Autowired
//	private KafkaTemplate<String, String> kafkaTemplate;
	
	@Autowired
	private KafkaTemplate<String, MessageBodyEx> kafkaTemplateMessageBodyEx;

//	public void sendMessageToTopic(String message) {
//		kafkaTemplate.send("CodeDecodeTopic", message);
//	}

	public void sendMessageToTopicPost(MessageBodyEx message) {
		kafkaTemplateMessageBodyEx.send("CodeDecodeTopic", message);
	}
}
