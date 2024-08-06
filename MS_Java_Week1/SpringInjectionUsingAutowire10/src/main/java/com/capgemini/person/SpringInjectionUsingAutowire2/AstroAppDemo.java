package com.capgemini.person.SpringInjectionUsingAutowire2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AstroAppDemo {

	public static void main(String[] args) {

		ApplicationContext context =  new AnnotationConfigApplicationContext("com.capgemini.person.SpringInjectionUsingAutowire2");
		AstroProcessor astroProcessor = context.getBean(AstroProcessor.class);
		astroProcessor.processExecution();
		
		SampleScopeService sampleScopeService = context.getBean(SampleScopeService.class);
		sampleScopeService.setValue("Hello");
		System.out.println(sampleScopeService.getValue());
		
		System.out.println(sampleScopeService);
		
		
		SampleScopeService sampleScopeService1 = context.getBean(SampleScopeService.class);
		System.out.println(sampleScopeService1);
	}
	

}
