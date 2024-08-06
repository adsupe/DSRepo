package com.cg.customer.product.entity;

import java.util.List;

import jakarta.persistence.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String gender;
    
    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="cp_fk",referencedColumnName = "id")
    private List<Product> products;
    
    public Customer() {
		super();
	}
 
	public Customer(String name, String email, String gender, List<Product> products) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.products = products;
	}
 
	public int getId() {
		return id;
	}
 
	public void setId(int id) {
		this.id = id;
	}
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public String getEmail() {
		return email;
	}
 
	public void setEmail(String email) {
		this.email = email;
	}
 
	public String getGender() {
		return gender;
	}
 
	public void setGender(String gender) {
		this.gender = gender;
	}
 
	public List<Product> getProducts() {
		return products;
	}
 
	public void setProducts(List<Product> products) {
		this.products = products;
	}
 
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + ", products="
				+ products + "]";
	}
}