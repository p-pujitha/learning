/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pujitha.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author ppujita5
 */
public class HelloSpringApp {

    public static void main(String[] args) {
        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        //retrieve bean from spring container
        Coach coach = context.getBean("myCoach", Coach.class);

        //call methods on the bean
        System.out.println(coach.getDailyWorkOut());

        System.out.println(coach.getDailyFortune());

        //close the context
        context.close();
    }
}
