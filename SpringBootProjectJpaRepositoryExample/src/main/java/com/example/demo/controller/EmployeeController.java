package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmpService;

@RestController
public class EmployeeController {
    
	@Autowired
	private EmpService empService;
	
	@PostMapping(value="/save")
	public String saveEmployeeData(@RequestBody Employee employee) {
		System.out.println("Employee Data : "+employee);
		empService.saveEmployee(employee);
		
		return "Save Successfully";
		
	}
	@GetMapping(value="/log")
	public Employee getEmployeeUsingUnameAndPass(@RequestParam String uname,@RequestParam String pass) {
		System.out.println("Login Credentials : "+ uname +" "+ pass);
		Employee employee=empService.getLoginData(uname, pass);
		return employee;
	}
	@GetMapping(value="/get/{uname}")
	public Employee getEmployeeUsingOnlyUname(@PathVariable String uname) {
		System.out.println("Username : "+ uname);
		Employee employee=empService.getDataUsingOnlyUname(uname);
		return employee;
	}
	@GetMapping(value="/getAll")
	public List<Employee>getAllEmployeeData(){
		List<Employee>list=empService.getAllEmployee();
		return list;
	}
	@GetMapping(value="/getEmp/{id}")
	public Employee employeeUsingId(@PathVariable int id) {
		System.out.println("Employee Id : "+ id);
		Employee employee=empService.getEmployeeUsingId(id);
		return employee;
	}
	@PutMapping(value="/up")
	public String employeeUpdate(@RequestBody Employee employee) {
		System.out.println("Update Employee : "+ employee);
		empService.employeeUpdate(employee);
		return "successfully update";
	}
	
	@DeleteMapping(value="/del/{id}")
	public String deleteEmployee(@PathVariable int id) {
		empService.deleteById(id);
		return "Successfully deleted";
	}
	
	
	
	
	

}
