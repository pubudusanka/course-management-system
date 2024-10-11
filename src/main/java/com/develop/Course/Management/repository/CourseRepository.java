package com.develop.Course.Management.repository;

import com.develop.Course.Management.entity.Course;
import com.develop.Course.Management.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.lang.String;
import java.lang.Long;
import java.util.List;
import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course, Long> {
    Optional <Course> findByTitle(String title);
    List <Student> findStudentById(@Param("course_id")Long course_id);
}
