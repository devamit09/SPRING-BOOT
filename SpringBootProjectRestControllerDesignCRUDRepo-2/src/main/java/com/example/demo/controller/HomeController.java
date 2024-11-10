package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class HomeController {
	
	@Autowired
	private StudentService ss;
	
	
	@PostMapping(value="/reg")   //to store data in database
	public String getRegisterData(@RequestBody Student student) {
		System.out.println("Registered Data : "+ student);
		ss.saveStudentData(student);
		return "Register Successfully!!!";
	}
	
	@GetMapping(value="/log")
	public Student getStudentUsingUnameAndPass(@RequestParam String uname,@RequestParam String pass) {
      System.out.println("Login Credentials : "+ uname +" "+ pass);
      Student student=ss.getLoginData(uname, pass);
	return student;
	}
	
	@GetMapping(value="/get/{uname}")
	public Student getStudentUsingOnlyUname(@PathVariable String uname) {
		System.out.println("Username : "+ uname);
		Student student=ss.getDataUsingOnlyUname(uname);
		return student;
		
	}
	
	@GetMapping(value="/getAll")
	public List<Student>getAllStudentData() {
		List<Student>list=ss.getAllStudent();
		return list;
		
	}
	@GetMapping(value="/getstu/{id}")
	public Student getSingleStudentUsingId(@PathVariable int id) {
		System.out.println("Student Id : "+ id);
		Student student=ss.getStudentUsingId(id);
		return student;
		
	}
	
	@PutMapping(value="/up")
	public String studentUpdate(@RequestBody Student student) {
		System.out.println("Update Student : " + student);
		ss.studentUpdate(student);
		return "successfully update";
		
		
	}
	@DeleteMapping(value="/del/{id}")
	public String deleteStudent(@PathVariable int id) {
		ss.deleteById(id);
		return "successfully deleted";
	}
	
}
