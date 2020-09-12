package com.radha.repository;

import com.radha.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    @Override
    <S extends Employee> S save(S s);

    @Override
    Optional<Employee> findById(Integer integer);
}
