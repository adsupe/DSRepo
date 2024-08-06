package com.cg.customer.product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.cg.customer.product.entity.Customer;
import com.cg.customer.product.entity.Product;
import com.cg.customer.product.repo.CustomerRepository;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
@ComponentScan("com.cg.customer.product.*")
public class CustomerProductDemoOperation {

	@Autowired
	private CustomerRepository customerRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CustomerProductDemoOperation.class, args);
	}
	
//	@PostConstruct
//	public void initBook() {
//		List<Product> pr1 = new ArrayList<Product>();
//		pr1.add(new Product("iphone",11,100000));
//		pr1.add(new Product("iphone15",21,150000));
//		
//		
//		List<Customer> customers = Stream.of(
//				new Customer("AA","aa@gmail.com","M",pr1))
//				.collect(Collectors.toList());
//		customerRepository.saveAll(customers);
//	}

}
