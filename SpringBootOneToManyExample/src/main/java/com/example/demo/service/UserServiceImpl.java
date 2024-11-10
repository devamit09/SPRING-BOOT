package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.entity.User;
import com.example.demo.repo.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void addUserData(User user) {
		
		userRepository.save(user);
		
	}

	@Override
	public void buyProduct(int id, Product product) {
		User user = userRepository.findById(id).get();
		user.getProducts().add(product);
		userRepository.save(user);
		
	}

	@Override
	public void buyProductAll(int id, List<Product> products) {
		User user = userRepository.findById(id).get();
		for (Product product : products) {
			user.getProducts().add(product);
		}
		userRepository.save(user);
		
		
	}

}
