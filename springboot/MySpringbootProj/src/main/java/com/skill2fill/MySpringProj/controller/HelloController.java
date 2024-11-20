package com.skill2fill.MySpringProj.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello from Springboot";
	}
	
	@RequestMapping("/count/{value}")
	public int sumNumberOfValues(@PathVariable("value") int value) {
		int sum=0;
		for(int i=0; i<value; i++) {
			sum +=i;
		}
		return sum;
	}


}
