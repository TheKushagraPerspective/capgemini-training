package com.capg.microservice.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loan")
public class LoanServiceController {
	
	@GetMapping("/getall")
    public String getLoanDetails() {
        return "Loan Service Working...";
    }
}
