package com.cg.customer.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.customer.product.entity.Product;

@Repository
public interface ProductRepository  extends JpaRepository<Product, Integer>{

}
