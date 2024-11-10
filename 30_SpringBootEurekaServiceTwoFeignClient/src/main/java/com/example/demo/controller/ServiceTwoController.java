package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ServiceTwo;

@RestController
public class ServiceTwoController {
	
	@Autowired
	private ServiceTwo serviceTwo;
	
	@GetMapping(value="/consume")
	public String getConsumeData() {
		String str=serviceTwo.getData();
		return str;
		
	}
	
	@GetMapping(value="/consume{{id}}")
	public String getConsumeDataUsingId(@PathVariable int id) {
		String str=serviceTwo.getDataUsingId(id);
		return str;
		
	}
	
	
	
	

}
