package com.capgemini.person.SpringInjectionUsingAutowire2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan("com.capgemini.person.SpringInjectionUsingAutowire2")
public class AstroAppConfig {
	

	@Bean("humanService")
	public HumanService getHumanService() {
		return new HumanService();
	}
	
	@Bean("robotService")
	public RobotService getRobotService() {
		return new RobotService();
	}
	
	//if @Bean is declared here in the configure, then no need of @Component in the main class of SampleScopeService.
//	@Bean("sampleScopeService")
//	@Scope("singleton")
//	public SampleScopeService getSampleScopeService() {
//		return new SampleScopeService();
//	}
	
}
