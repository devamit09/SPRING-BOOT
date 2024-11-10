package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmpService {
	
	void saveEmployee(Employee employee);
	
    Employee getLoginData(String uname,String pass);
	
	Employee getDataUsingOnlyUname(String uname);
	
	List<Employee>getAllEmployee();
	
	Employee getEmployeeUsingId(int id);
	
	void employeeUpdate(Employee employee);
	
	void deleteById(int id);
}
