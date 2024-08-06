package oldcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/firstwelcome")
	public String viewPage() {
		return "welcome";
	}
}
