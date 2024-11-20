package com.pujitha.spring.referenceInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("studentconfig.xml");
        Student student = (Student) context.getBean("student");
        Scores scores = student.getScores();

        System.out.println(scores.getMaths());
        System.out.println(scores.getChemistry());
        System.out.println(scores.getPhysics());

    }
}
