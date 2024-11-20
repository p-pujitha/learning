package com.pujitha.spring.spEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstructorTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereotypeannotations/config.xml");
        Instructor instructor = (Instructor) context.getBean("inst");
        System.out.println(instructor);
    }
}
