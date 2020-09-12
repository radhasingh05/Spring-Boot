package com.radha.service;

import com.radha.entity.Employee;
import com.radha.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee save(Employee employee){
        return employeeRepository.save(employee);
    }

    public Optional<Employee> findById(Integer id){
        return employeeRepository.findById(id);
    }
}
