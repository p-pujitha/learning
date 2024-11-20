package com.pujitha.spring;

import com.pujitha.spring.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class EmployeeTest
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Employee employee = (Employee) context.getBean("emp");
        System.out.println("Employee id:" + employee.getId());
        System.out.println("Employee name :" + employee.getName());


    }
}
