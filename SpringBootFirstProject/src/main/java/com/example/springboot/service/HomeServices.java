package com.example.springboot.service;

import java.util.List;

import com.example.springboot.entity.Student;

public interface HomeServices {
	
	void saveStudentData(Student student);
	
	List<Student> getLoginData(String uname,String pass);

}
