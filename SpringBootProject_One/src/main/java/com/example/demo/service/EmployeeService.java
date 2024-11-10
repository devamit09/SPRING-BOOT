package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {
	
	void saveEmployeeData(Employee e);
	
	List<Employee> getAllEmployee(String uname, String pass);
	
	public void deleteEmployee(int id);

	public Employee editEmployeeData(int id);

	public void updateEmployeeData(Employee e);
	
	
}
