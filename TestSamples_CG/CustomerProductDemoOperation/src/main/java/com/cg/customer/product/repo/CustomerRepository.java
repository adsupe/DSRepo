package com.cg.customer.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.customer.product.entity.Customer;
import com.cg.customer.product.projections.CustomerProductView;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

	@Query("SELECT c.name,c.email,p.productName,p.qty,p.price from Customer c inner join c.products p  WHERE c.id= :customerId AND p.pid= :pid")
	CustomerProductView getCustomerProjection(@Param("customerId") int customerId ,@Param("pid") int pid);
}
