package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeDao {
	
	void saveEmployeeData(Employee e);
	
	public List<Employee>getAllEmployee(String uname,String pass);
	
	public void deleteEmployee(int id);

	public Employee editEmployee(int id);

	public void updateStudent(Employee e);

}
