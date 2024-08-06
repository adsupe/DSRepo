package com.cg.customer.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.customer.product.entity.Customer;
import com.cg.customer.product.projections.CustomerProductView;
import com.cg.customer.product.service.CustomerService;

@RestController()
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customer")
	public List<Customer> getAllCustomer(){
		return customerService.getAllCustomer();
	}
	
	@DeleteMapping("/customer/{id}")
	public ResponseEntity<HttpStatus> deleteByCustomerId(@PathVariable Integer id){
		return customerService.deleteCustomerById(id);
	}
	
	@GetMapping("/customer/{customerId}/{pid}")
	public CustomerProductView getCustomerProductById(@PathVariable int customerId,@PathVariable int pid) {
		return customerService.getCustomerProductById(customerId, pid);
	}
	
}
