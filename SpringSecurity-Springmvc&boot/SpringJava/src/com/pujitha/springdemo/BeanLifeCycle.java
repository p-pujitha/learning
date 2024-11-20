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
public class BeanLifeCycle {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanLifeCycleAC.xml");

        TrackCoach coach = context.getBean("myCoach", TrackCoach.class);

        System.out.println(coach.getDailyWorkOut());

        context.close();
    }
}
