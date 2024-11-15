package com.example.demo.consumerservice;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
	
		
		@KafkaListener(topics="kafkatopic",groupId="group_id_one")
		public void getConsumedData(String str) {
			System.out.println("Data consumed from : " + str);
			
		
	}
		@KafkaListener(topics="kafkatopic",groupId="group_id_one")
		public void getConsumedStudentData(String student) {
			System.out.println("Data Consumed From Kafka Producer " + student);
		}

}
