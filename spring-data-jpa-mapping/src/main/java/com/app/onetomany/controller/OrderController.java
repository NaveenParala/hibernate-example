package com.app.onetomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.onetomany.dto.OrderRequest;
import com.app.onetomany.dto.OrderResponse;
import com.app.onetomany.model.Customer;
import com.app.onetomany.repository.CustomerRepository;
import com.app.onetomany.repository.ProductRepository;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping("/placeOrder")
	public Customer placeOrder(@RequestBody OrderRequest request) {
		
		return customerRepository.save(request.getCustomer());
	}
	@GetMapping("/findAll")
	public List<Customer> findAllOrders(){
		List<Customer> list= customerRepository.findAll();
		return list;
	}
	
	@GetMapping("/responseInfo")
	public List<OrderResponse> findResponse(){
		List<OrderResponse> list= customerRepository.getInformationOrder();
		return list;
	}
	
}
