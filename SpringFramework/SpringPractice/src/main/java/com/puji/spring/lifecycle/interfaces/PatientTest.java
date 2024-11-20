package com.puji.spring.lifecycle.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PatientTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("lifecycle/interfacelifecycleconfig.xml");
       Patient patient = (Patient) context.getBean("patient");
       System.out.println(patient);

    }
}
