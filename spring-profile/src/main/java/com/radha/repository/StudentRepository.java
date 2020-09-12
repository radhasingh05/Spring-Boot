package com.radha.repository;

import com.radha.core.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    @Override
    List<Student> findAll();

    @Override
    <S extends Student> S save(S s);

    @Override
    void deleteById(Integer integer);



}
