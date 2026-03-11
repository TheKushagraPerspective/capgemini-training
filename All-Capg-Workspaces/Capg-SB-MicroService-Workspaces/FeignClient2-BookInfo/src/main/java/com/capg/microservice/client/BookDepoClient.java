package com.capg.microservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.capg.microservice.model.BookDepo;

@FeignClient(name = "BookDepoClient" , url="${depo.service.url}")
public interface BookDepoClient {
	
	@GetMapping("/depo/{depoId}")
	public BookDepo getById(@PathVariable int depoId);
}
