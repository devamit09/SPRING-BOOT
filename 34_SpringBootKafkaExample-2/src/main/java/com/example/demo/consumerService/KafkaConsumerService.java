package com.example.demo.consumerService;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
@Service
public class KafkaConsumerService {
	
	@KafkaListener(topics="kafkatopic",groupId="group_id_one")
	public void getConsumeData(String str) {
		System.out.println("Data consumed from = Kafka Producer");
		
	}
		

}
