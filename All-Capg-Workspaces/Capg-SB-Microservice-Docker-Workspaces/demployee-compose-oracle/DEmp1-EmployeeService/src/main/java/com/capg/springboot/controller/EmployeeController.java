package com.capg.springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.entity.Employee;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @GetMapping
    public ResponseEntity<Employee> getEmployee() {

        Employee employee = new Employee();

        employee.setId(1L);
        employee.setFirstName("Kushagra");
        employee.setLastName("Sharma");
        employee.setEmail("kushagra@gmail.com");
        employee.setDepartment("Engineering");
        employee.setDesignation("Software Developer");
        employee.setSalary(75000.0);

        ResponseEntity<Employee> response = new ResponseEntity<>(employee, HttpStatus.OK);

        return response;
    }
}
