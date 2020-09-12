package com.radha.entity;

import org.hibernate.annotations.Check;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name="student",schema = "my_schema")
@Check(constraints = "sex IN ('M','F')")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "student_id")
    private Integer studentId;
    @Column(name = "student_name")
    private String studentName;
    @NotNull
    @Column(name="email_id")
    private String emailId;
    @Column(name = "sex")
    private String sex;
    @Column(name="student_address")
    private String studentAddress;

    @OneToMany
    @JoinTable(name = "student_courses" ,joinColumns = {@JoinColumn(name="student_id")} , inverseJoinColumns = {@JoinColumn(name="course_id")})
    private List<Course> course;

    public Student(){}

    public Student(Integer studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }
}
