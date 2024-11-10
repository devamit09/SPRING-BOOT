package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class RegisterController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/save")
	public void saveUserData(@RequestBody User user) {
		System.out.println(user);
		userService.saveUser(user);

	}

	@GetMapping(value = "/get/{id}")
	public User getUserDataUsingId(@PathVariable int id) {
		System.out.println("check id : " + id);
    	User user = userService.getUserUsingId(id);
    	return user;

	}
	
	@PutMapping(value = "/update")
    public String updateData(@RequestBody User user) {
    	System.out.println("User updated Data :  " + user);
    	userService.updateData(user);
    	return "User Update Successfully";
    }
	
	

}
