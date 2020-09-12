package com.radha.entity;

import javax.persistence.*;

@Entity
@Table(name = "course" , schema = "my_schema")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "course_id")
    private Integer courseId;
    @Column(name = "course_name")
    private String courseName;
    @Column(name = "course_number")
    private Integer courseNumber;

    public Course(){}

    public Course(Integer courseId, String courseName, Integer courseNumber) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(Integer courseNumber) {
        this.courseNumber = courseNumber;
    }
}
