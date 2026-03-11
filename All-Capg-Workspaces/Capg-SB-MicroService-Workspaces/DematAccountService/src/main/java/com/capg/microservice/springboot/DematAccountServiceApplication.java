package com.capg.microservice.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DematAccountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DematAccountServiceApplication.class, args);
		System.out.println("DematAccount service server started...");
	}

}
