package com.radha.controller;

import com.radha.entity.Employee;
import com.radha.service.EmployeeService;
import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    private static final Logger LOG = LoggerFactory.getLogger(EmployeeController.class.getName());

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public Employee save(@RequestBody Employee employee){
        LOG.info("inside the save method "+ employee);
        return employeeService.save(employee);
    }

    @GetMapping("/findById/{id}")
    public Optional<Employee> findById(@PathVariable("id") Integer id){
        LOG.info("inside the findById method id :"+id);
        return employeeService.findById(id);
    }


}
