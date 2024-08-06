package com.cg.customer.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.customer.product.entity.Customer;
import com.cg.customer.product.exception.CustomerNotFoundException;
import com.cg.customer.product.projections.CustomerProductView;
import com.cg.customer.product.repo.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public List<Customer> getAllCustomer() {
		return customerRepository.findAll();
	}

	@Override
	public Customer createCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer findCustomerById(Integer id) {
		return customerRepository.findById(id).orElseThrow(()-> new CustomerNotFoundException("Customer not found !"));
	}

	@Override
	public Customer updateCustomer(Customer oldCustomer) {
		Customer newCustomer = customerRepository.findById(oldCustomer.getId()).orElseThrow(()-> new CustomerNotFoundException("Customer not found !"));
		newCustomer.setEmail(oldCustomer.getEmail());
		newCustomer.setGender(oldCustomer.getGender());
		newCustomer.setName(oldCustomer.getName());
		customerRepository.save(newCustomer);
		return newCustomer;
	}

	@Override
	public ResponseEntity<HttpStatus> deleteCustomerById(Integer id) {
		Customer customer = customerRepository.findById(id).orElseThrow(()-> new CustomerNotFoundException("Customer not found !"));
		 customerRepository.deleteById(customer.getId());
		 return new ResponseEntity<>(HttpStatus.OK);
	}

	@Override
	public CustomerProductView getCustomerProductById(int customerId, int pid) {
		return customerRepository.getCustomerProjection(customerId, pid);
	}

}
