package com.capgemini.in.SpringInjectionUsingCollections;

public class Address {

	private int id;
	
	private String address1;
	
	//Constructor is must in case of constructor based injection
	public Address(int id, String address1) {
		super();
		this.id = id;
		this.address1 = address1;
	}

	public int getId() {
		return id;
	}

//	public void setId(int id) {
//		this.id = id;
//	}

	public String getAddress1() {
		return address1;
	}

//	public void setAddress1(String address1) {
//		this.address1 = address1;
//	}
	
	
}
