package com.pujitha.spring.standalonecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductListTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("standalonecollections/standaloneconfig.xml");
        ProductList productList = (ProductList) context.getBean("productsList");
        System.out.println(productList);
    }
}
