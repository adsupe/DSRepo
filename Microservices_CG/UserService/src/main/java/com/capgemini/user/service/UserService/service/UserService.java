package com.capgemini.user.service.UserService.service;

import java.util.List;

import com.capgemini.user.service.UserService.entity.User;

public interface UserService {
	User saveUser(User user);
	//get all users
	List<User>getAllUser();
	//get single user
	User getUser(String userId);
	

}
