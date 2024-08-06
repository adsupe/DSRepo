package com.codedecode.KafkaDemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codedecode.KafkaDemo.service.KafkaProducer;
import com.codedecode.KafkaDemo.service.MessageBodyEx;

@RestController
@RequestMapping("/rest/api")
public class FetchMessageFromClient {

	@Autowired
    KafkaProducer kafkaProducer;


//    @GetMapping(value = "/producer")
//    public String sendMessage(@RequestParam("message") String message)
//    {
//        kafkaProducer.sendMessageToTopic(message);
//        return "Message sent Successfully to the your code decode topic ";
//    }
    
    @PostMapping(value = "/producer")
    public String sendMessagePost(@RequestBody MessageBodyEx message)
    {
        kafkaProducer.sendMessageToTopicPost(message);
        return "Message POST sent Successfully to the your code decode topic ";
    }
	
}
