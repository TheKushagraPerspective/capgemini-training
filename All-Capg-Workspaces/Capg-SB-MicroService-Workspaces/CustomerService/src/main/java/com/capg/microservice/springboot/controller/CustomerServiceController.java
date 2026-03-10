package com.capg.microservice.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.microservice.springboot.entity.Customer;
import com.capg.microservice.springboot.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerServiceController {
	
	@Autowired
	CustomerService service;

	@GetMapping("/getall")
	public List<Customer> getAllCustomer() {
        return service.getAllCustomer();
    }
	
	@PostMapping("/add")
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.addCustomer(customer);
	}
	
	@GetMapping("/{id}")
	public Customer getCustomer(@PathVariable("id") int id) {
		return service.getCustomerById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteCustomer(@PathVariable("id") int id) {
		if(service.deleteCustomerById(id)) {
			return "Customer Deleted Successfully";
		}
		else {
			return "Customer Deleted Failed";
		}
	}
	
}
