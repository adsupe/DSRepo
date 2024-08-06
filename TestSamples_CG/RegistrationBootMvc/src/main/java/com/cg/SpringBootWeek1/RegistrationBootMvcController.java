package com.cg.SpringBootWeek1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("regBootMvcDto")
public class RegistrationBootMvcController {
	
	@Autowired
	RegBootMvcDto regBootMvcDto;
	
	@RequestMapping("/formpage")
	public String registration(Model model) {
		
		model.addAttribute("regBootMvcDto",regBootMvcDto);
		return "formpage";
	}

	@RequestMapping("/showreg")
	public String showResult(RegBootMvcDto regBootMvcDto,Model model)
	{
		model.addAttribute("regBootMvcDto",regBootMvcDto);
		return "showreg";
		
	}
}
