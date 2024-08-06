package com.capgemini.in.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetServiceDemo {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		GreetingService greetingService = context.getBean("greetingService",GreetingService.class);
		
		greetingService.printMessage();
	}

}
