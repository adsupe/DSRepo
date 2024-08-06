package com.capgemini.user.service.UserService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.user.service.UserService.entity.User;
import com.capgemini.user.service.UserService.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;
	@PostMapping
	public ResponseEntity<User>createUser(@RequestBody User user)
	{
		User user1 = userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
		
	}
	
	@GetMapping
	public ResponseEntity<List<User>>getAllUser(){
		
		List<User>userAll = userService.getAllUser();
		
		return ResponseEntity.ok(userAll);
		
		
		
	}
	@GetMapping("/{userId}")
	public ResponseEntity<User>getUserById(@PathVariable String userId)
	{
	
		User user = userService.getUser(userId);
		return ResponseEntity.ok(user);
	}

}
