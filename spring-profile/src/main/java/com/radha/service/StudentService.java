package com.radha.service;

import com.radha.core.Student;
import com.radha.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student save(Student student){
        return studentRepository.save(student);
    }

    public List<Student> getAll(){
        return studentRepository.findAll();
    }

    public void delete(){
        studentRepository.deleteAll();
    }
}
