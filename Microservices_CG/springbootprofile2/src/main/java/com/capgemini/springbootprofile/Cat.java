package com.capgemini.springbootprofile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("cat")
public class Cat implements Animal{

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("meow");
	}
	public void eat()
	{
		System.out.println("Animals eat to survive");	}

}
