package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmpRepository;

@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	private EmpRepository empRepository;

	@Override
	public void saveEmployee(Employee employee) {
		System.out.println("In Service Layer : "+employee);
		empRepository.save(employee);
		
	}

	@Override
	public Employee getLoginData(String uname, String pass) {
		Employee employee=empRepository.findByUnameAndPass(uname,pass);
		return employee;
	}

	@Override
	public Employee getDataUsingOnlyUname(String uname) {
		Employee employee=empRepository.findByUname(uname);
		return employee;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee>list=empRepository.findAll();
		return list;
	}

	@Override
	public Employee getEmployeeUsingId(int id) {
		Employee employee=empRepository.findById(id).get();
		return employee;
	}

	@Override
	public void employeeUpdate(Employee employee) {
		empRepository.save(employee);
		
	}

	@Override
	public void deleteById(int id) {
		empRepository.deleteById(id);
		
	}

}
