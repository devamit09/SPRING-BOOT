package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value="/user/get")
	public ResponseEntity<User>getUserData(@RequestParam String uname,@RequestParam String pass){
		System.out.println("Login Credentials : "+uname+" "+pass);
		User user=userService.getUserByUnameAndPass(uname,pass);
		return ResponseEntity.ok(user);
	}
	

}
