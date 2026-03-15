package com.capg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.model.Book;
import com.capg.springboot.service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookController {
	
	@Autowired
	BookService service;
	
	@GetMapping
	public List<Book> getAllBooks() {
		return service.getAllBooks();
	}
	
	@GetMapping("/{bookId}")
	public Book getById(@PathVariable("bookId") Long id) {
		return service.getById(id);
	}
	
	@PostMapping
	public String addBook(@RequestBody Book book) {
		return service.addBook(book);
	}
	
	@PutMapping("/{bookId}")
	public String updateById(@PathVariable("bookId") Long id , @RequestBody Book book) {
		return service.updateById(id , book);
	}
	
	@DeleteMapping("/{bookId}")
	public String deleteById(@PathVariable("bookId") Long id) {
		return service.deleteById(id);
	}
}
