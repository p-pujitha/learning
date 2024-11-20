package com.pujitha.spring.springjdbc.employee.test;

import com.pujitha.spring.springjdbc.employee.dao.EmployeeDao;
import com.pujitha.spring.springjdbc.employee.dto.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class TestEmployeeDao {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("employeetemplate/employeedaoconfig.xml");
        EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeedao");
//        Employee e = new Employee();
//        e.setId(2);
//        e.setFirstName("kranthi");
//        e.setLastName("J");
//        int result = employeeDao.create(e);
//        System.out.println("No.of records created :" + result);
//
//        Employee e = new Employee();
//        e.setId(2);
//        e.setFirstName("kranthi");
//        e.setLastName("Jonnalagadda");
//        int result = employeeDao.update(e);
//        System.out.println("No.of records updated :"+ result);

//        int result = employeeDao.delete(1);
//        System.out.println("No.of records deleted :"+result);
//        Employee e = employeeDao.read(2);
//        System.out.println(e.getFirstName() + e.getLastName());

        List<Employee> employees = employeeDao.read();
        for(Employee employee : employees){
            System.out.println(employee);
        }
    }
}
