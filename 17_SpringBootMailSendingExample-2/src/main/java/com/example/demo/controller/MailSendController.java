package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailSendController {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@GetMapping(value="/send")
	void sendEmail() {
		SimpleMailMessage msg= new SimpleMailMessage();
		msg.setTo("amitvits3@gmail.com","amitsahu.java143@gmail.com");
		
		msg.setSubject("Testing from Spring Boot");
		msg.setText("Hello World on Spring Boot Email");
		
		javaMailSender.send(msg);
	}

}
