package com.radha.controller;

import com.radha.entity.Employee;
import com.radha.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Optional;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    private static final Logger LOG = LoggerFactory.getLogger(EmployeeController.class.getName());

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public Employee save(@RequestBody Employee employee){
        LOG.info("Inside the employee controller save() method");
        return employeeService.save(employee);
    }

    @GetMapping("/findById/{id}")
    public Optional<Employee> findById(@PathVariable("id") Integer id){
        LOG.info("Inside the employee controller findById() method for id "+id);
        return employeeService.findById(id);
    }

    @GetMapping("/exception")
    public String exception(){
        String response = "";
        try {
            int i = 1/0;
        }catch(Exception e){
            e.printStackTrace();
            LOG.error("error "+e);

            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);

            e.printStackTrace(pw);
            String sStackTrace = sw.toString();
            LOG.error(sStackTrace);
            response = sStackTrace;
        }

        return response;
    }

}
