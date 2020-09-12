package com.radha.repository;

import com.radha.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {

    List<Course> findAll();

    Course saveAndFlush(Course course);
}
