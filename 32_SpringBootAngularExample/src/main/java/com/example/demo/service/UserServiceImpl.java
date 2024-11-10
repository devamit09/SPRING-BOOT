package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void saveUser(User user) {
		userRepository.save(user);
		
	}

	@Override
	public User getUserUsingId(int id) {
		User user = userRepository.findById(id).get();
		return user;
	}

	@Override
	public void updateData(User user) {
		userRepository.save(user);
		
	}

}
