package com.example.springboot.dao;

import java.util.List;

import com.example.springboot.entity.Student;

public interface HomeDao {
	
	void saveStudentData(Student student);
	
	List<Student>getLoginData(String uname,String pass);

}
