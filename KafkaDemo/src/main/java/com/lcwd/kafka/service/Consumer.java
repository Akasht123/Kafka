package com.lcwd.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@KafkaListener(topics="CodeDecode" , groupId="codeDecode_group")
	public void listenToTopic(String receiveMessage) {
		System.out.println("the message recived is "+receiveMessage);
	}
}
