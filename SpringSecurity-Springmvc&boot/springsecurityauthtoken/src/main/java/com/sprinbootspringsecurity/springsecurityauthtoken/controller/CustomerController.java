/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sprinbootspringsecurity.springsecurityauthtoken.controller;

import com.sprinbootspringsecurity.springsecurityauthtoken.model.Customer;
import com.sprinbootspringsecurity.springsecurityauthtoken.repository.CustomerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ppujita5
 */

@RestController
public class CustomerController {
    
    @Autowired
    CustomerRepository customerRepository;
    
    @GetMapping("/healthcheck")
    public ResponseEntity<String> findHealthCheck(){
        return ResponseEntity.ok("Application is healthy");
    }
    
     @PostMapping("/customers")
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
        return ResponseEntity.ok(customerRepository.save(customer));
    }
    
    @GetMapping("/customers")
    public ResponseEntity<List<Customer>>  findAllCustomers(){
        return ResponseEntity.ok(customerRepository.findAll());
    }
}
