package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController                   //always return jsp page
public class HomeController {
	
	@RequestMapping(value="/getStu")
	public Student showStudentData() {
		Student student=new Student();
		student.setId(1234);
		student.setName("Amit");
		student.setAddress("BBSR");
		return student;
		
	}
	@RequestMapping(value="/getStuAll")
	public List<Student> showAllStudentData() {
		List<Student>list=new ArrayList<Student>();
		Student student=new Student();
		student.setId(1234);
		student.setName("Amit");
		student.setAddress("BBSR");
		
		
			Student student1=new Student();
			student1.setId(1234);
			student1.setName("Amit");
			student1.setAddress("BBSR");
			
			Student student2=new Student();
			student2.setId(1234);
			student2.setName("Amit");
			student2.setAddress("BBSR");
			
			Student student3=new Student();
			student3.setId(1234);
			student3.setName("Amit");
			student3.setAddress("BBSR");
			
			list.add(student);
			list.add(student1);
			list.add(student2);
			list.add(student3);
			
			return list;
	}
	

}
