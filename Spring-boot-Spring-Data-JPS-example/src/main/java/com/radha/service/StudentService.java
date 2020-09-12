package com.radha.service;

import com.radha.entity.Student;

import java.util.List;

public interface StudentService {
     List<Student> getStudents();
     Student createStudent(Student student);
}
