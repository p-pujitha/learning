package com.pujitha.spring.injectinginterfaces;

import org.springframework.stereotype.Component;

@Component("dao1")
public class OrderDAOImpl implements OrderDAO {
    @Override
    public void createOrder() {
    System.out.println("In order DAO Impl - createorder method");
    }
}
