package com.capgemini.springbootprofile.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.springbootprofile.beans.MyDataSource;

@Configuration
public class Myconfiguration {
	@Bean
	public MyDataSource myDataSource(@Value("${mydatasource.username}")String username,@Value("${mydatasource.password}")String password)
	{
		
		
		MyDataSource myDataSource = new MyDataSource();
		myDataSource.setUsername(username);
		myDataSource.setPassword(password);
		//System.out.println("The username is "+myDataSource.getUsername());
		//System.out.println("The password is" +myDataSource.getPassword());
		return myDataSource;
	}

}

