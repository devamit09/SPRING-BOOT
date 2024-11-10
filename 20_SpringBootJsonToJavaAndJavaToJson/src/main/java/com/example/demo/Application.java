package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		SpringApplication.run(Application.class, args);
		
		ObjectMapper objectMapper = new ObjectMapper();
//		objectMapper.setSerializerProvider(p)
		
		System.out.println("------Json Ta Java Conversion-----");
		
		String str="{\"id\":\"1\",\"name\":\"Amit Kumar Sahu\",\"address\":\"BBSR\"}";
		System.out.println("Json Data : "+str);
		
		Employee employee=objectMapper.readValue(str, Employee.class);
		System.out.println("After Java Conversion : "+employee);
		
		System.out.println("-----Java To Json Conversion------");
		
		String str1=objectMapper.writeValueAsString(employee);
		System.out.println(str1);
	}

}
