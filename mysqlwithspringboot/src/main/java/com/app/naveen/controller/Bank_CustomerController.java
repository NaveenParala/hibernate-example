package com.app.naveen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.naveen.dto.Bank_Customer;
import com.app.naveen.entity.Bank;
import com.app.naveen.repository.BankRepository;
import com.app.naveen.repository.CustomerRepository;

@RestController
@RequestMapping("/bank_customer")
public class Bank_CustomerController {

	@Autowired
	private BankRepository bankRepository;
	@Autowired
	private CustomerRepository customerRepository;
	
	@PostMapping("/save")
	public  Bank saveCustomer(@RequestBody Bank_Customer bank_Customer) {
		
		return bankRepository.save(bank_Customer.getBank());
	}
}
