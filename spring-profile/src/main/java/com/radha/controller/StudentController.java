package com.radha.controller;

import com.radha.core.Student;
import com.radha.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/save")
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }

    @GetMapping(value = "/getAll")
    public List<Student> getAll(){
        return studentService.getAll();
    }

    @DeleteMapping(value = "/delete")
    public void delete(){
        studentService.delete();
    }

    @PutMapping(value = "/update")
    public Student update(@RequestBody Student student){
       return studentService.save(student);
    }

}
