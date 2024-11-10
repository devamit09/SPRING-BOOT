package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepository;

@Service
public class HomeServiceImpl implements HomeService{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void saveStudentData(Student student) {
		System.out.println("In Service Layer : "+student);
		studentRepository.save(student);
		
	}

}
