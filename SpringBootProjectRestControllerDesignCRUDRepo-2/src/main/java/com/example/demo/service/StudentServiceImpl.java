package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;


	@Override
	public void saveStudentData(Student student) {
		System.out.println("In Service Layer : "+student);
		studentRepository.save(student);
		
	}


	@Override
	public Student getLoginData(String uname, String pass) {
		Student student=studentRepository.findByUnameAndPass(uname, pass);
		return student;
	}


	@Override
	public Student getDataUsingOnlyUname(String uname) {
		Student student=studentRepository.findByUname(uname);
		return student;
	}



	@Override
	public List<Student> getAllStudent() {
		List<Student>list=(List<Student>) studentRepository.findAll();
		return list;
	}


	@Override
	public Student getStudentUsingId(int id) {
		Student student=studentRepository.findById(id).get();
		return student;
	}


	@Override
	public void studentUpdate(Student student) {
		studentRepository.save(student);
		
	}


	@Override
	public void deleteById(int id) {
		studentRepository.deleteById(id);
		
	}

}
