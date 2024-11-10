package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.HomeService;

@RestController
public class HomeController {
	
	@Autowired
	private HomeService homeService;
	
	@PostMapping(value="/reg")   //to store data in database
	public String getRegisterData(@RequestBody Student student) {
		System.out.println("Registered Data : "+ student);
		homeService.saveStudentData(student);
		return "Register Successfully!!!";
		
	}

}
