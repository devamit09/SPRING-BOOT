package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {

	void saveUser(User user);

	User getUserUsingId(int id);

	void updateData(User user);

}
