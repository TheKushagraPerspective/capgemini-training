package com.capg.springboot.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.capg.springboot.model.BookDTO;

@FeignClient(name = "BOOK-SERVICE")
public interface BookClient {
	
	@GetMapping("/api/books")
	public List<BookDTO> getAllBooks();
	
	@GetMapping("/api/books/{bookId}")
	public BookDTO getById(@PathVariable("bookId") Long id);
	
	@PostMapping("/api/books")
	public String addBook(@RequestBody BookDTO book);
	
	@PutMapping("/api/books/{bookId}")
	public String updateById(@PathVariable("bookId") Long id , @RequestBody BookDTO updatedBook);
	
	@DeleteMapping("/api/books/{bookId}")
	public String deleteById(@PathVariable("bookId") Long id);
}
