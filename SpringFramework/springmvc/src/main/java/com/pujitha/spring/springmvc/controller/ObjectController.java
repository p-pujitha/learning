package com.pujitha.spring.springmvc.controller;

import com.pujitha.spring.springmvc.dto.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ObjectController {
    @RequestMapping("/readObject")
    public ModelAndView sendObject(){
        ModelAndView  modelAndView = new ModelAndView();
        modelAndView.setViewName("displayObject");
        Employee e = new Employee();
        e.setId(101);
        e.setName("John");
        e.setSalary(8000);
        modelAndView.addObject("employee", e);
        return modelAndView;
    }
}
