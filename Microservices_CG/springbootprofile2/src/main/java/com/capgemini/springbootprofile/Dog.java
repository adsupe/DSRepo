package com.capgemini.springbootprofile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dog")
public class Dog implements Animal {

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Bow");
	}

}
