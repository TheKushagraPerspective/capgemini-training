package com.capg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.entity.Product;
import com.capg.springboot.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/getall")
    public List<Product> getProducts() {
        return service.getAllProducts();
    }
    
    @GetMapping("/{id}")
    public Product getById(@PathVariable long id) {
        return service.getById(id);
    }
}