package com.capgemini.person.SpringInjectionUsingAutowire2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SampleScopeService {

	private int c;
	
	private String value;


	
	public void setC(int c) {
		this.c = c;
	}


	public void setValue(String value) {
		this.value = value;
	}


	public int getC() {
		return c;
	}


	public String getValue() {
		return value;
	}

	
}
