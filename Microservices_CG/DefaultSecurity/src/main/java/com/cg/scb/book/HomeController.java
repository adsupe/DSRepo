package com.cg.scb.book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/welcome") 
	public String home() 
	{ 
		return "This is the welcome request"; 
	} 
	
	@GetMapping("/admin") 
	public String admin() 
	{ 
		return "This is the admin request"; 
	}
	
	@GetMapping("/user") 
	public String user() 
	{ 
		return "This is the user request"; 
	}
}
