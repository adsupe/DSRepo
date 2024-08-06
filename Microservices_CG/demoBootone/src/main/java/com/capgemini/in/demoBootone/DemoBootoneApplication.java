package com.capgemini.in.demoBootone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.capgemini.in.demoBootone.bean.MyAppProperties;

@SpringBootApplication
//@ComponentScan(basePackages="com.capgemini.in.demoBootone*")
public class DemoBootoneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(DemoBootoneApplication.class,args);
		MyAppProperties mybean = context.getBean(MyAppProperties.class);
		System.out.println(mybean);
		
	}

}
