package com.capg.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Docker3MovieCatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Docker3MovieCatalogServiceApplication.class, args);
		System.out.println("Docker3 movie catalog server is running on port: 9000");
	}

}
