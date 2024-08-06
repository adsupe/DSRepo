package study.springboot.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import study.springboot.crud.entities.Student;
import study.springboot.crud.services.StudentService;

@Controller
public class HomeController
{
      @Autowired
	  public StudentService studentService;
	
	@GetMapping("/")
	 public String goHome()
     {
    	  System.out.println("Home controller called");
    	 return "home";
     }
     @RequestMapping(value="/registration")
       public String getRegsisterForm()
     {
    	  System.out.println("Registration controller invoked");
    	 return"StudentRegistration";
     }
     
      @RequestMapping(value="/register", method=RequestMethod.POST)
     public String  getRegistrationProcess(@ModelAttribute Student student, Model model)
     {
    	 
    	    
    	     Student student1=null;
    	     student1=   this.studentService.saveRecord(student);
    	     
    	  
    	  System.out.println("Student Data :-"+student1); 
    	 
    	  return "redirect:/success";
     }
     @GetMapping("/success")
 	public String success(Model model) {
 		List<Student> students = studentService.getStudents();
 		model.addAttribute("students", students);
 		return "success";
 	}
     
     
}
