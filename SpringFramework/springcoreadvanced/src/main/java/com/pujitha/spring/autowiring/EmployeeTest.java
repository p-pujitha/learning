package com.pujitha.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/autowireinjectionconfig.xml");
        Employee emp = (Employee) context.getBean("employee");
        System.out.println(emp);
    }
}