package com.capg.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.capg.microservice.client")
@SpringBootApplication
public class FeignClient2BookInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignClient2BookInfoApplication.class, args);
		System.out.println("Book Info server started...");
	}

}
