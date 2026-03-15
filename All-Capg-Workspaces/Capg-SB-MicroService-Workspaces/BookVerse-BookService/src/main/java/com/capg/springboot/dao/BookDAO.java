package com.capg.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.springboot.model.Book;

public interface BookDAO extends JpaRepository<Book , Long> {

}
