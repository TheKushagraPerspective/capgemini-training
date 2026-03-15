package com.capg.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BookVerseEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookVerseEurekaServerApplication.class, args);
		System.out.println("BookVerse Eureka server started...");
	}

}
