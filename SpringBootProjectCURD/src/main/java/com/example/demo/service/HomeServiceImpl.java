package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.HomeDao;
import com.example.demo.model.Student;

@Service
public class HomeServiceImpl implements HomeService{
	
	@Autowired
	private HomeDao homeDao;

	@Override
	public void saveStudentData(Student student) {
		
		System.out.println("In Service Layer : "+student);
		homeDao.saveStudentData(student);
		
		
	}

	@Override
	public List<Student> getLoginData(String uname, String pass) {
		
		return homeDao.getLoginData(uname, pass);
	}

	@Override
	public void deleteStudent(int id) {
		homeDao.deleteStudent(id);
		
	}

	@Override
	public Student editStudentData(int id) {
		
		return homeDao.editStudent(id);
	}

	@Override
	public void updateStudentData(Student student) {
		homeDao.updateStudent(student);
		
	}


}
