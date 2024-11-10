package com.example.demo.service;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Login;

public interface LoginService {
	
	void saveLoginData(Login login);
	
	Login getLoginDetails(String uname,String pass);
	
	Employee getDataUsingOnlyUname(String uname);
    
	Employee getEmployeeById(int id);
}
