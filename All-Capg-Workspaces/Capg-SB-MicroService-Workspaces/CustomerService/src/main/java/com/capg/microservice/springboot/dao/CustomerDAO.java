package com.capg.microservice.springboot.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.capg.microservice.springboot.entity.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CustomerDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public Customer save(Customer customer) {
		return em.merge(customer);
	}
	
	public List<Customer> findAll() {
		return em.createQuery("FROM Customer", Customer.class).getResultList();
	}
	
	public Customer findById(int id) {
		return em.find(Customer.class , id);
	}
	
	public Customer updateById(int id , Customer customer) {
		Customer cust = em.find(Customer.class, id);
		
		cust.setName(customer.getName());
		cust.setEmail(customer.getEmail());
		cust.setPhone(customer.getPhone());
		
		return em.merge(cust);
	}
	
	public boolean deleteById(int id) {
		Customer customer = em.find(Customer.class, id);
        if(customer != null) {
            em.remove(customer);
            return true;
        }
        else {
        	return false;
        }
	}
}
