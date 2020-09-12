package com.radha.controller;

import com.radha.entity.Student;
import com.radha.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    StudentServiceImpl studentService;

    @GetMapping(value ="/getStudents")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }


    @PostMapping(value ="/createStudent")
    public Student createStudent(@RequestBody final Student student){
        return studentService.createStudent(student);
    }

}
