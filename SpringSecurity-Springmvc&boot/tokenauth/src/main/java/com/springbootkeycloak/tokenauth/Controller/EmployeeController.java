/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springbootkeycloak.tokenauth.Controller;

import com.springbootkeycloak.tokenauth.model.Employee;
import com.springbootkeycloak.tokenauth.repository.EmployeeRepository;
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
public class EmployeeController {
    
    @Autowired
    EmployeeRepository employeeRepository;
    
    
    @PostMapping("/employees")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        return ResponseEntity.ok(employeeRepository.save(employee));
    }
    
    @GetMapping("/employees")
    public ResponseEntity<List<Employee>>  findAllEmployees(){
        return ResponseEntity.ok(employeeRepository.findAll());
    }
    
    @GetMapping("/healthcheck")
    public ResponseEntity<String> findHealthCheck(){
        return ResponseEntity.ok("Application is healthy");
    }
}
