package com.capg.microservice.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demat")
public class DematAccountServiceController {

	@GetMapping("/getall")
	public String getDematAccount() {
        return "Demat Account Service Working";
    }
}
