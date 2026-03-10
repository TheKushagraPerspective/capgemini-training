package com.capg.microservice.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.microservice.springboot.dao.CustomerDAO;
import com.capg.microservice.springboot.entity.Customer;

@Service
public class CustomerService {
	
	@Autowired
	CustomerDAO dao;
	
	public List<Customer> getAllCustomer() {
		return dao.findAll();
	}
	
	public Customer addCustomer(Customer customer) {
		return dao.save(customer);
	}

	public Customer getCustomerById(int id) {
		return dao.findById(id);
	}
	
	public boolean deleteCustomerById(int id) {
		return dao.deleteById(id);
	}
}
