package com.capg.springboot.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capg.springboot.dto.Book;
import com.capg.springboot.dto.Info;
import com.capg.springboot.dto.Rating;

@RestController
@RequestMapping("/info")
public class InfoServiceController {
	
	@Autowired
	RestTemplate rest;
	
	@GetMapping("/list/{bookId}")
	public List<Info> getAllData(@PathVariable("bookId") int id) {
		Book book = rest.getForObject("http://localhost:9001/cato/list" , Book.class);
		Rating rating = rest.getForObject("http://localhost:9002/rating/list" , Rating.class);
		
		return Collections.singletonList(new Info(id , book.getBookName() , rating.getBookRating()));
	}

}
