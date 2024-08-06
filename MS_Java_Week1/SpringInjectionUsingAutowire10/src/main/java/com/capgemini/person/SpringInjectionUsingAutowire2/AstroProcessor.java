package com.capgemini.person.SpringInjectionUsingAutowire2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AstroProcessor {

	
	private final AstroService astroService;
	

	@Autowired
	public AstroProcessor(@Qualifier("humanService") AstroService astroService) {
		this.astroService = astroService;
	}
	
	public void processExecution() {
		astroService.astroProcess();
	}
	
	
}
