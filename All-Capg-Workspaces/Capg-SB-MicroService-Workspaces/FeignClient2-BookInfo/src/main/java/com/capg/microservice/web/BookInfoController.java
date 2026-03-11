package com.capg.microservice.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.microservice.client.BookDepoClient;
import com.capg.microservice.model.BookDepo;
import com.capg.microservice.model.BookInfo;

@RestController
@RequestMapping("/book")
public class BookInfoController {
	
	private final BookDepoClient depoClient;
	
	public BookInfoController(BookDepoClient depoClient) {
		this.depoClient = depoClient;
	}
	
	
	@GetMapping("/{bookId}")
	public Map<String , Object> bookDetails(@PathVariable int bookId) {
		BookInfo info = new BookInfo(bookId,"Spring Boot","John",500);
		BookDepo depo = depoClient.getById(101);
		
		Map<String , Object> response = new HashMap<>();
		
		response.put("Book Info" , info);
		response.put("Book Depo" , depo);
		
		return response;
	}
}
