package com.capg.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.dto.Book;

@RestController
@RequestMapping("/rating")
public class RatingController {
	
	//http://localhost:9002/rating/list	
	@GetMapping("/list")
	public Book getAllData() {
		return new Book(101 , 8);
	}
}
