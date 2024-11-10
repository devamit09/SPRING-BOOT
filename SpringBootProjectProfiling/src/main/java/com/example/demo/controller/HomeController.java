package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController          //it returns only data
public class HomeController {
	
	@Value(value="${myapp}")
	private String app;
	
	@RequestMapping(value ="/")
	public String GetData() {
		
		return "Application Started in "+app;
		
	}

}
