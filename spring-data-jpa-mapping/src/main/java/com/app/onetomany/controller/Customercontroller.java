package com.app.onetomany.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class Customercontroller {
	@GetMapping("/")
	public String sayHello() {
		return "Hello";
	}
}
