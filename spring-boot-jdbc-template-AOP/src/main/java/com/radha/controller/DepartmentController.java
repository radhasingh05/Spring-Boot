package com.radha.controller;


import com.radha.repository.DepartmentRepository;
import com.radha.util.Loggable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/dept")
public class DepartmentController {

    @Autowired
    DepartmentRepository departmentRepository;

    @Loggable
    @GetMapping(path="/getDepartments")
    public List<String> getDepartments(){
        System.out.println("getDepartments in side the method ...");
        return departmentRepository.getDepartments();
    }

}
