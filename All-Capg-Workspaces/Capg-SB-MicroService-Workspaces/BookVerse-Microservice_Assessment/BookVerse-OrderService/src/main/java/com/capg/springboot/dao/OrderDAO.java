package com.capg.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.springboot.model.Order;

@Repository
public interface OrderDAO extends JpaRepository<Order , Long> {

}
