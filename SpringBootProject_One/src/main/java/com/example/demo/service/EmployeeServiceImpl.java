package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public void saveEmployeeData(Employee e) {
		System.out.println("Employee in Service "+ e);
		employeeDao.saveEmployeeData(e);
	
		
	}

	@Override
	public List<Employee> getAllEmployee(String uname, String pass) {
		
		return employeeDao.getAllEmployee(uname, pass);
	}

	@Override
	public void deleteEmployee(int id) {
		employeeDao.deleteEmployee(id);
		
	}

	@Override
	public Employee editEmployeeData(int id) {
		
		return employeeDao.editEmployee(id);
	}

	@Override
	public void updateEmployeeData(Employee e) {
		
		employeeDao.updateStudent(e);
		
	}

}
