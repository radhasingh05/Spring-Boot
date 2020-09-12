package com.radha.service;

import com.radha.entity.Course;

import java.util.List;

public interface CourseService {

    List<Course> getCourses();
    Course createCourse(Course course);

}
