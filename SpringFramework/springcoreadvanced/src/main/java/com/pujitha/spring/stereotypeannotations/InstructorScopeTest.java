package com.pujitha.spring.stereotypeannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstructorScopeTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereotypeannotations/config.xml");
        Instructor instructor1 = (Instructor) context.getBean("inst");
        System.out.println(instructor1.hashCode() + " ---> "+ instructor1);
        Instructor instructor2 = (Instructor) context.getBean("inst");
        System.out.println(instructor2.hashCode()+ "--->" +instructor2);
    }
}
