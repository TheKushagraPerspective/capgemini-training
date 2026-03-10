package com.capg.microservice.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerServiceController {

	@GetMapping("/getall")
	public String getCustomer() {
        return "Customer Service Working";
    }
}
