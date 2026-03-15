package com.capg.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.springboot.dao.BookDAO;
import com.capg.springboot.model.Book;

@Service
public class BookService {

	@Autowired
	BookDAO dao;
	
	
	public List<Book> getAllBooks() {
		return dao.findAll();
	}
	
	public Book getById(Long id) {
		return dao.findById(id).orElse(null);
	}
	
	public String addBook(Book book) {
		Book saveResult = dao.save(book);
		if(saveResult != null) {
			return "Book Successfully added";
		}
		else {
			return "Failed to add the book";
		}
	}
	
	public String updateById(Long id , Book updatedBook) {
		Optional<Book> existingBook = dao.findById(id);
		
		if(existingBook.isPresent()) {
			Book book = existingBook.get();
			
			book.setTitle(updatedBook.getTitle());
            book.setAuthor(updatedBook.getAuthor());
            book.setIsbn(updatedBook.getIsbn());
            book.setPrice(updatedBook.getPrice());
            book.setQuantity(updatedBook.getQuantity());
            book.setCategory(updatedBook.getCategory());
            
            Book updateResult = dao.save(book);
    		if(updateResult != null) {
    			return "Book Successfully updated";
    		}
    		else {
    			return "Failed to update the book";
    		}
		}
		else {
			return "Book doesn't exist";
		}
	}
	
	
	public String deleteById(Long id) {
		dao.deleteById(id);
		return "Successfully deleted the book";
	}
}

