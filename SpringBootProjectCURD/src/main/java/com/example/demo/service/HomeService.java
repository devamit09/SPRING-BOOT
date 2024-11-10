package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface HomeService {

	void saveStudentData(Student student);

	List<Student> getLoginData(String uname, String pass);

	public void deleteStudent(int id);

	public Student editStudentData(int id);

	public void updateStudentData(Student student);

}
