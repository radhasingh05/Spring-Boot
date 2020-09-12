package com.radha.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<String> getEmployees() {
        List<String> employees = new ArrayList<>();
        employees.addAll(jdbcTemplate.queryForList("select empFirstName from my_schema.Employees",String.class));
        return employees;

    }
}
