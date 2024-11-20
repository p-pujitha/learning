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
public class SetterDemo {

    public static void main(String[] args) {
        //load the configuration file
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        //retrieve bean from spring container
        CricketCoach coach = classPathXmlApplicationContext.getBean("myCricketCoach", CricketCoach.class);

//        Coach coach = classPathXmlApplicationContext.getBean("myCricketCoach", Coach.class);
        //call methons on the bean
        System.out.println(coach.getDailyWorkOut());

        System.out.println(coach.getDailyFortune());

        System.out.println(coach.getEmailAddress());

        System.out.println(coach.getTeam());

//close the context
        classPathXmlApplicationContext.close();
    }
}
