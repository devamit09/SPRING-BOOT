package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {
	
	void saveStudentData(Student student);
	
	Student getLoginData(String uname,String pass);
	
	Student getDataUsingOnlyUname(String uname);
	
	List<Student>getAllStudent();
	
	Student getStudentUsingId(int id);
	
	void studentUpdate(Student student);
	
	void deleteById(int id);
	
	

}
