/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pujitha.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author ppujita5
 */
@Controller
public class DemoController {

    @GetMapping("/")
    public String showHome() {

        return "home";
    }

    //add mapping for leaders
    @GetMapping("/leaders")
    public String showLeaders() {

        return "leaders";
    }
    
    @GetMapping("/systems")
    public String showSystems() {

        return "systems";
    }
}
