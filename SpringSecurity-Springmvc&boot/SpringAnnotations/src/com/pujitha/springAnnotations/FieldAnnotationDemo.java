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
public class FieldAnnotationDemo {

    public static void main(String[] args) {
             ClassPathXmlApplicationContext context;
        context = new ClassPathXmlApplicationContext("annotationapplicationcontext.xml");
        
        SwimCoach coach = context.getBean("swimCoach",SwimCoach.class);
        
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getEmail());
        System.out.println(coach.getTeam());
        
        context.close();
    }
}
