package com.puji.spring.propertiesplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDAOTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("properties/propertiesconfig.xml");
        MyDAO myDAO = (MyDAO) context.getBean("mydao");
        System.out.println(myDAO);
    }
}
