package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {
	
	User getUserByUnameAndPass(String uname,String pass);

}