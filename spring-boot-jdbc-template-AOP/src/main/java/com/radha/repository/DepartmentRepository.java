package com.radha.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DepartmentRepository {


    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<String> getDepartments() {
        List<String> dept = new ArrayList<>();
        dept.addAll(jdbcTemplate.queryForList("select dempName from my_schema.Department",String.class));
        return dept;

    }
}
