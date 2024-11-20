package com.pujitha.spring.injectinginterfaces;

import org.springframework.stereotype.Component;


@Component("dao2")
public class OrderDAOImpl2 implements OrderDAO{
    @Override
    public void createOrder() {
        System.out.println("In orderDAOIMpl2 - create order method");
    }
}
