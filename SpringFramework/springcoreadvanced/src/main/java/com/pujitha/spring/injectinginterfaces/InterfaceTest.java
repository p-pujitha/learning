package com.pujitha.spring.injectinginterfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InterfaceTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("injectinginterfaces/interfaceconfig.xml");
        OrderB0 orderB0 = (OrderB0) context.getBean("orderbo");
        orderB0.placeOrder();
    }
}
