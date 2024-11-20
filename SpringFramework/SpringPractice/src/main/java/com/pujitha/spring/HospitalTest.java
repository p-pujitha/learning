package com.pujitha.spring;

import com.pujitha.spring.Hospital;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HospitalTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("listconfig.xml");
        Hospital hospital = (Hospital) context.getBean("hospital");
        System.out.println(hospital.getName());
        System.out.println(hospital.getDepartments());
        System.out.println(hospital.getDepartments().getClass());
    }
}
