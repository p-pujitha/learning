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
public class BeanScopeDemo {

    public static void main(String[] args) {

        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanscopeApplicationContext.xml");

        //retrieve bean from the spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        //Check if these are same beans ?
        boolean result = (theCoach == alphaCoach);

        System.out.println("Pointing to the same obj ? - " + result);

        System.out.println("Memory location for the coach : -" + theCoach);

        System.out.println("Memory location for the coach : -" + alphaCoach);
        
        //close the context
        context.close();

    }
}
