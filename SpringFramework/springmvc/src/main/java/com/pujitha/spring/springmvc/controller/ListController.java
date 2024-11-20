package com.pujitha.spring.springmvc.controller;

import com.pujitha.spring.springmvc.dto.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
@Controller
public class ListController {

    @RequestMapping("/readList")
    public ModelAndView sendList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("displayList");

        Employee e = new Employee();
        e.setId(101);
        e.setName("John");
        e.setSalary(8000);

        Employee e1 = new Employee();
        e1.setId(102);
        e1.setName("Pujitha");
        e1.setSalary(9000);

        Employee e2 = new Employee();
        e2.setId(103);
        e2.setName("Kranthi");
        e2.setSalary(10000);
        List<Employee> employees = new ArrayList<>();
        employees.add(e);
        employees.add(e1);
        employees.add(e2);

        modelAndView.addObject("employees", employees);
        return modelAndView;
    }
}
