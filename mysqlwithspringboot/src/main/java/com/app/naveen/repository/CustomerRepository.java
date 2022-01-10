package com.app.naveen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.naveen.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
