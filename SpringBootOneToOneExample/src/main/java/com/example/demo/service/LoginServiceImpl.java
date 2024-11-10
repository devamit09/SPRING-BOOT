package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Login;
import com.example.demo.repo.EmployeeRepository;
import com.example.demo.repo.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginRepository loginRepository;
	
	private EmployeeRepository empRepository;

	@Override
	public void saveLoginData(Login login) {
		
		loginRepository.save(login);
		
		
	}

	@Override
	public Login getLoginDetails(String uname, String pass) {
		Login login = loginRepository.findByUnameAndPass(uname, pass);
		if(login != null ) {
			return login;
		}
		return null;
	}

	@Override
	public Employee getEmployeeById(int id) {
		Employee employee=empRepository.findById(id).get();
		return employee;
	}

	@Override
	public Employee getDataUsingOnlyUname(String uname) {
		
		return null;
	}

	

	

}
