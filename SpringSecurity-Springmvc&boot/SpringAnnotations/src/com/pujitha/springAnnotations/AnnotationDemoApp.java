/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pujitha.springAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author ppujita5
 */
public class AnnotationDemoApp {

    public static void main(String[] args) {

        //read spring configuration file
        ClassPathXmlApplicationContext context;
        context = new ClassPathXmlApplicationContext("annotationapplicationcontext.xml");

        //get bean from spring container
//        Coach coach = context.getBean("tenniscoach", Coach.class);
//        Coach coach = context.getBean("tennisCoachDefault", Coach.class);
//        Coach coach = context.getBean("tennisCoachFieldInject", Coach.class);
        Coach coach = context.getBean("tennisCoachQualifier", Coach.class);

        //call methods on the bean
        System.out.println(coach.getDailyWorkout());

        System.out.println(coach.getDailyFortune());

        //close the container
        context.close();
    }
}
