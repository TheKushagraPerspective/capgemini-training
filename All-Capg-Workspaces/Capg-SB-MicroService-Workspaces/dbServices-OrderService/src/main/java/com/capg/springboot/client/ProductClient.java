package com.capg.springboot.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.capg.springboot.dto.ProductDTO;

@FeignClient(name = "PRODUCT-SERVICE")
public interface ProductClient {

    @GetMapping("/products")
    List<ProductDTO> getProducts();
    
    @GetMapping("/products/{id}")
    ProductDTO getById(@PathVariable long id);
}

 