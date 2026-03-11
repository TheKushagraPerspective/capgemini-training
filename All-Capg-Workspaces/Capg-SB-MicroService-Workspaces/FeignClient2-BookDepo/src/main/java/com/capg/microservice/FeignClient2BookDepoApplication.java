package com.capg.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FeignClient2BookDepoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignClient2BookDepoApplication.class, args);
		System.out.println("Book Depo Server started...");
	}

}
