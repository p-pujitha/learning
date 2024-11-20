package com.puji.spring.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrescriptionTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("dependencycheck/dependencycheckconfig.xml");
        Prescription prescription = (Prescription) context.getBean("prescription");
        System.out.println(prescription);
    }
}
