package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceOneController {
	
	@GetMapping(value="/get")
	public String getData() {
		System.out.println("Check controller Called..");
		return "Data From Service One.";
	}
	
	@GetMapping(value="/get/{id}")
	public String getDataUsingId(@PathVariable int id) {
		System.out.println("Check controller Called.."+id);
		return "Data From Service One Using Id";
	}

}
