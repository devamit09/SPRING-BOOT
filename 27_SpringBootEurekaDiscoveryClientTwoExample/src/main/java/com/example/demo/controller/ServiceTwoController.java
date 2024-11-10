package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceTwoController {
	
	@GetMapping(value="/")
	public String getStringData() {
		System.out.println("In Service Two Controller");
		return "service two called.";
		
	}


}
