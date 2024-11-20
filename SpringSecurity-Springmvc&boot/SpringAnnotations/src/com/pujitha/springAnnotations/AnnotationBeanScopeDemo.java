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
public class AnnotationBeanScopeDemo {
    
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationapplicationcontext.xml");
        
        Coach theCoach = context.getBean("tennisCoachDefault", Coach.class);
        
        Coach alphaCoach = context.getBean("tennisCoachDefault", Coach.class);
        
        boolean result = (theCoach == alphaCoach);
        
        System.out.println("Result :" + result);
        System.out.println("Memory location for the coach: " + theCoach);
        System.out.println("Memory location for alpha coach: " + alphaCoach);
        
        context.close();
        
    }
}
