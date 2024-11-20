package com.puji.spring.lifecycle.interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PatientPreShutDownHookTest {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle/interfacelifecycleconfig.xml");
        Patient patient = (Patient) context.getBean("patient");
        System.out.println(patient);
        context.registerShutdownHook();
    }
}
