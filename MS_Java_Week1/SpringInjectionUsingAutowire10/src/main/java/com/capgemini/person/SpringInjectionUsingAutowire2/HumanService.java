package com.capgemini.person.SpringInjectionUsingAutowire2;

public class HumanService implements AstroService{

	@Override
	public void astroProcess() {

		System.out.println("Human speaking Astro");
	}

}
