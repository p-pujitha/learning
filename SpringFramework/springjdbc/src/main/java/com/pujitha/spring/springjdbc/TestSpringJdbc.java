package com.pujitha.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestSpringJdbc {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbctemplate/jdbctemplateconfig.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
        String sql = "insert into employee values(?,?,?)";
        int result = jdbcTemplate.update(sql,1,"pujitha","p");
        System.out.println("No.of records inserted : "+ result);
    }
}
