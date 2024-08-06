package com.cg.customer.product.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.cg.customer.product.entity.Customer;
import com.cg.customer.product.projections.CustomerProductView;

public interface CustomerService {

	public List<Customer> getAllCustomer();
	
	public Customer createCustomer(Customer customer);
	
	public Customer findCustomerById(Integer id);
	
	public Customer updateCustomer(Customer customer);
	
	public ResponseEntity<HttpStatus> deleteCustomerById(Integer id);
	
	public CustomerProductView getCustomerProductById(int customerId,int pid);
	
}
