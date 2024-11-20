package com.puji.spring.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("innerbeans/innerbeansconfig.xml");
        Employee emp = (Employee) context.getBean("employee");
//        System.out.println(emp);


        //Test bean scopes
        System.out.println(emp.hashCode() + "---> " + emp);
        Employee emp1 = (Employee) context.getBean("employee");
        System.out.println(emp1.hashCode() + "---> " + emp1);
    }
}
