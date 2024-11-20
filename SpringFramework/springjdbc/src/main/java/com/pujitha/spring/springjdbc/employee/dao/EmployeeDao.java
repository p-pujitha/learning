package com.pujitha.spring.springjdbc.employee.dao;

import com.pujitha.spring.springjdbc.employee.dto.Employee;

import java.util.List;

public interface EmployeeDao {
    int create(Employee e);

    int update(Employee e);

    int delete(int id);

    Employee read(int id);

    List<Employee> read();


}
