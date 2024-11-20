/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pujitha.springsecuritykeycloak.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ppujita5
 */
@RestController
public class HealthCheckController {
    
    @GetMapping("/healthCheck")
    public String getHealthCheck(){
        return "Applicaiton is running";
    }
    
}
