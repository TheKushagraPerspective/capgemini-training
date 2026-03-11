package com.capg.microservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.microservice.model.BookDepo;

@RestController
@RequestMapping("/depo")
public class BookDepoController {

	@GetMapping("/{id}")
	public BookDepo getById(@PathVariable int id) {
		return new BookDepo(id , "Delhi Book Depo");
	}
}
