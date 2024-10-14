package com.lcwd.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.kafka.service.Producer;

@RestController
@RequestMapping("/rest/api")
public class RestControllerForKafka {
	@Autowired
	Producer producer;
	
	@GetMapping("/producerMsg")
	public void getMessageFromClient(@RequestParam("message") String message) {
		
	}

}
