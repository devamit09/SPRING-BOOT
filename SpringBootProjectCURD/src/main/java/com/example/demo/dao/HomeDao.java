package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Student;

public interface HomeDao {

	void saveStudentData(Student student);

	List<Student> getLoginData(String uname, String pass);

	public void deleteStudent(int id);

	public Student editStudent(int id);

	public void updateStudent(Student student);

}
