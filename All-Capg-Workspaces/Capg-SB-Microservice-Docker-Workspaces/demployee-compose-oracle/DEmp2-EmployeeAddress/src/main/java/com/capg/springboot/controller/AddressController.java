package com.capg.springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.entity.Address;

@RestController
@RequestMapping("/api/addresses")
public class AddressController {

    @GetMapping
    public ResponseEntity<Address> getAddress() {

        Address address = new Address();

        address.setId(1L);
        address.setEmployeeId(1L);
        address.setStreet("123 MG Road");
        address.setCity("Bangalore");
        address.setState("Karnataka");
        address.setCountry("India");
        address.setZipCode("560001");

        ResponseEntity<Address> response = new ResponseEntity<>(address, HttpStatus.OK);

        return response;
    }
}
