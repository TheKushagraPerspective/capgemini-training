package com.capg.springboot;

import com.capg.springboot.controller.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BookVerseBookServiceApplication {

    private final BookController bookController;

    BookVerseBookServiceApplication(BookController bookController) {
        this.bookController = bookController;
    }

	public static void main(String[] args) {
		SpringApplication.run(BookVerseBookServiceApplication.class, args);
		System.out.println("BookVerse Book service started...");
	}

}
