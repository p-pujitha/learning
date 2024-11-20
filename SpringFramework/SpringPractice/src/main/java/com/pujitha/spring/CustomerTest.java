package com.pujitha.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("mapconfig.xml");
        Customer customer = (Customer) context.getBean("customer");
        System.out.println(customer.getId());
        System.out.println(customer);
    }
}
