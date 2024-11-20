package com.pujitha.spring.springjdbc.employee.dao.impl;

import com.pujitha.spring.springjdbc.employee.dao.EmployeeDao;
import com.pujitha.spring.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.pujitha.spring.springjdbc.employee.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("employeedao")
public class EmployeeDaoImpl implements EmployeeDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int create(Employee e) {
        String sql = "insert into employee values(?,?,?)";
        int result = jdbcTemplate.update(sql, e.getId(), e.getFirstName(), e.getLastName());
        return result;
    }

    @Override
    public int update(Employee e) {
        String sql = "update employee set firstname=?,lastname=? where id=?";
        int result = jdbcTemplate.update(sql, e.getFirstName(), e.getLastName(), e.getId());
        return result;

    }

    @Override
    public int delete(int id) {
        String sql = "delete from employee where id=?";
        int result = jdbcTemplate.update(sql, id);
        return result;
    }

    @Override
    public Employee read(int id) {
        String sql = "select * from employee where id=?";
        EmployeeRowMapper employeeRowMapper = new EmployeeRowMapper();
        Employee emp = jdbcTemplate.queryForObject(sql, employeeRowMapper, id);
        return emp;
    }

    @Override
    public List<Employee> read() {
        String sql = "select * from employee";
        EmployeeRowMapper employeeRowMapper = new EmployeeRowMapper();
        List<Employee> employees = jdbcTemplate.query(sql, employeeRowMapper);
        return employees;
    }


    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
