package com.example.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.dao.HomeDao;
import com.example.springboot.entity.Student;

@Service
public class HomeServicesImpl implements HomeServices {
	
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

}
