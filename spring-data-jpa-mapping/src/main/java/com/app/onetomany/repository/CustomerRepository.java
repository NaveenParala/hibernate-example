package com.app.onetomany.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.onetomany.dto.OrderResponse;
import com.app.onetomany.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	@Query("SELECT new com.app.onetomany.dto.OrderResponse(c.name,p.productName) FROM Customer c JOIN c.products p")
	public List<OrderResponse> getInformationOrder();

}
