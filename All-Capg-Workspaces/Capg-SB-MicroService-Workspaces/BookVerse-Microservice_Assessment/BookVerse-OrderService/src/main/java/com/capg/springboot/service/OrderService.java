package com.capg.springboot.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.springboot.client.BookClient;
import com.capg.springboot.dao.OrderDAO;
import com.capg.springboot.model.BookDTO;
import com.capg.springboot.model.Order;

@Service
public class OrderService {

	@Autowired
	OrderDAO dao;
	
	@Autowired
	BookClient bookClient;
	
	public List<Order> getAllOrders() {
		return dao.findAll();
	}
	
	public Order getOrderById(Long id) {
		return dao.findById(id).orElse(null);
	}
	
	public String createOrder(Order order) {
		BookDTO existingBook = bookClient.getById(order.getBookId());
		
		if(existingBook != null) {
			double totalPrice = existingBook.getPrice() * order.getQuantity();
			order.setTotalPrice(totalPrice);
			order.setStatus("PLACED");
			order.setOrderDate(LocalDate.now());
			
			Order saveResult = dao.save(order);
			if(saveResult != null) {
				return "Order Successfully created";
			}
			else {
				return "Failed to create the order";
			}
		}
		else {
			return "Book doesn't exist.\nOrder cannot be created";
		}		
	}
	
//	update order status only
	public String updateOrder(Long id , Order updatedOrder) {
		Optional<Order> existingOrder = dao.findById(id);
		
		if(existingOrder.isPresent()) {
			
			Order order = existingOrder.get();
            order.setStatus(updatedOrder.getStatus());
            
            Order updateResult = dao.save(order);
    		if(updateResult != null) {
    			return "Order Status Successfully updated";
    		}
    		else {
    			return "Failed to update the order status";
    		}
		}
		else {
			return "Order doesn't exist";
		}
	}
	
	
	public String deleteOrder(Long id) {
		dao.deleteById(id);
		return "Successfully deleted the order";
	}
}
