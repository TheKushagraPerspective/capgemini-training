package com.capg.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DEmp1EmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DEmp1EmployeeServiceApplication.class, args);
		System.out.println("Employee service is now running on port 9001...");
	}

}
