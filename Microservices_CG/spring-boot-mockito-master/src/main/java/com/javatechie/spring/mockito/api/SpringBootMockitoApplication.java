package com.javatechie.spring.mockito.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javatechie.spring.mockito.api.dao.UserRepository;
import com.javatechie.spring.mockito.api.model.User;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootMockitoApplication {
	
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMockitoApplication.class, args);
	}
	
	@PostConstruct
	public void initUser() {
		List<User> users = Stream.of(
				new User(2, "WW", 20, "Haveli"),
				new User(2, "SS", 23, "Stree Street"),
				new User(2, "SP", 32, "Sitapalya"),
				new User(2, "RP", 45, "Rajapalya"))
				.collect(Collectors.toList());
		userRepository.saveAll(users);
	}
}
