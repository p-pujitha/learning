package com.pujitha.spring.springjdbc.employee.dao.rowmapper;

import com.pujitha.spring.springjdbc.employee.dto.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Employee emp = new Employee();
        emp.setId(resultSet.getInt(1));
        emp.setFirstName(resultSet.getString(2));
        emp.setLastName(resultSet.getString(3));
        return emp;
    }
}
