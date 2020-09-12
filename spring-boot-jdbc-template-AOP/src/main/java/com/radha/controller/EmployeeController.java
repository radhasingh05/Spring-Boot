package com.radha.controller;

import com.radha.repository.DepartmentRepository;
import com.radha.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/emp")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping
    public String check(){
        return "Hi....";
    }

    @GetMapping(path="/getEmployees")
    public List<String> getEmployees(){
        System.out.println("getEmployees in side the method ...");
        return employeeRepository.getEmployees();
    }


}
