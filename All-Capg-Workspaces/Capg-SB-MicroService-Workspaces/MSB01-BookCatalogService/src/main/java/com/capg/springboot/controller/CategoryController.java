package com.capg.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.dto.Book;

@RestController
@RequestMapping("/cato")
public class CategoryController {
	
	//http://localhost:9001/cato/list
	@GetMapping("/list")
	public Book getAllData() {
		return new Book(101 , "The Lord of the Ring");
	}
}
