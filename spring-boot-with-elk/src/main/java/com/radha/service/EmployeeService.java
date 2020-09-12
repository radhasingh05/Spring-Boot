package com.radha.service;

import com.radha.controller.EmployeeController;
import com.radha.entity.Employee;
import com.radha.repository.EmployeeRepository;
import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Optional;
import java.util.logging.Level;

@Service
public class EmployeeService {
    private static final Logger LOG = LoggerFactory.getLogger(EmployeeService.class.getName());

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee save(Employee employee){
        LOG.info("inside the save method employee :"+employee);
        try{
            return employeeRepository.save(employee);
        }catch(Exception e){
            e.printStackTrace();
            LOG.error("error "+e);

            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);

            e.printStackTrace(pw);
            String sStackTrace = sw.toString();
            LOG.error(sStackTrace);
        }
        return employeeRepository.save(employee);
    }

    public Optional<Employee> findById(Integer id){
        LOG.info("inside the findById method id : "+id);
        return employeeRepository.findById(id);
    }
}
