/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pujitha.springAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author ppujita5
 */
public class ChessJavaConfigDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context;
        context = new AnnotationConfigApplicationContext(SportConfig.class);

        //get bean from spring container
        ChessCoach coach = context.getBean("chessCoach", ChessCoach.class);

        //call methods on the bean
        System.out.println(coach.getDailyWorkout());

        System.out.println(coach.getDailyFortune());
        
        System.out.println(coach.getEmail());
        
        System.out.println(coach.getTeam());

        //close the container
        context.close();
    }
}
