package newcontroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CafeController {
	@RequestMapping("/cafehome")
	public String getCafe(Model model) {
		
		String name = "Ranjini";
		model.addAttribute("myname",name);
		return "welcome-cafe";
	}
	@RequestMapping("/processOrder")
	public String getOrder(HttpServletRequest request,Model model) {
		
		String order_name = request.getParameter("itemName");
		model.addAttribute("items", order_name);
		return "order";
	}
}
