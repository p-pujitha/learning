package com.pujitha.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDealerTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("setconfig.xml");
        CarDealer carDealer = (CarDealer) context.getBean("cardealer");
        System.out.println(carDealer.getName());
        System.out.println(carDealer.getModels());
        System.out.println(carDealer.getModels().getClass());
    }
}
