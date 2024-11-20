package com.puji.spring.constructorinjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdditionTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorinjection/ambiguityconfig.xml");
        Addition addition = (Addition) context.getBean("addition");

    }
}
