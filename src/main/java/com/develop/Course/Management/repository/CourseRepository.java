package com.develop.Course.Management.repository;

import com.develop.Course.Management.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
    Course findByName(String name);
    Course findById(long id);
}
