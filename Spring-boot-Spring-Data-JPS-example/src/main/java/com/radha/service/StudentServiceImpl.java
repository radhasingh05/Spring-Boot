package com.radha.service;

import com.radha.entity.Student;
import com.radha.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;


    @Override
    public List<Student> getStudents() {

        return studentRepository.findAll();
    }

    @Override
    public Student createStudent(Student student){
        return studentRepository.saveAndFlush(student);
    }
}
