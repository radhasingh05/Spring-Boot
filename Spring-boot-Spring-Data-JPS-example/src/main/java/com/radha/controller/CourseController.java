package com.radha.controller;

import com.radha.entity.Course;
import com.radha.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/course")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping(value = "/getCourses")
    public List<Course> getCourses(){
        return courseService.getCourses();
    }

    @PostMapping(value = "/createCourse")
    public Course createCourse(@RequestBody final Course course){
        return courseService.createCourse(course);
    }


}
