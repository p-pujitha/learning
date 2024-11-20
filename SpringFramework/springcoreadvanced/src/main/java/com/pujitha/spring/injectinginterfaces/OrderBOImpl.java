package com.pujitha.spring.injectinginterfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("orderbo")
public class OrderBOImpl implements OrderB0 {

    @Autowired
    @Qualifier("dao1")
    OrderDAO orderDAO;

    @Override
    public void placeOrder() {
        System.out.println("In order BO Impl");
        orderDAO.createOrder();
    }

    public OrderDAO getOrderDAO() {
        return orderDAO;
    }

    public void setOrderDAO(OrderDAO orderDAO) {
        this.orderDAO = orderDAO;
    }
}
