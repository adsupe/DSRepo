package com.cg.SpringBootWeek1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestJustController {
	
	@GetMapping("/index")
	public String welcome() {
		return "index";
	}

}
