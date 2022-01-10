package com.app.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.onetomany.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
