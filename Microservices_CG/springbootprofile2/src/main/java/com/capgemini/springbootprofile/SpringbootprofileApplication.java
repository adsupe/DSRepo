package com.capgemini.springbootprofile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capgemini.springbootprofile.beans.MyDataSource;



@SpringBootApplication
public class SpringbootprofileApplication implements CommandLineRunner {

	@Autowired
	Animal animal;
	@Value("${mycomp.name}")
	String companyname;
	@Autowired
	MyDataSource myDataSource;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootprofileApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//System.out.println(companyname);
		animal.makeSound();
		System.out.println(myDataSource.getUsername());
		System.out.println(myDataSource.getPassword());
	}

}
