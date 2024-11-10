package com.example.demo.service;

import com.example.demo.model.Student;

public interface KafkaProducerService {
	
	void msgProducer(String str);
	
	void studentDataProduce(Student student);

}
