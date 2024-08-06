package com.cg.customer.product.projections;

public class CustomerProductView {
	
	String name;
	
	String email;
	
	String productName;
	
	int qty;
	
	int price;
	

	public CustomerProductView(String name, String email, String productName, int qty, int price) {
		super();
		this.name = name;
		this.email = email;
		this.productName = productName;
		this.qty = qty;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public String getEmail() {
		return email;
	}


	public String getProductName() {
		return productName;
	}


	public int getQty() {
		return qty;
	}


	public int getPrice() {
		return price;
	}


	
	

}
