package com.develop.Course.Management.repository;

import com.develop.Course.Management.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import java.lang.String;
import java.lang.Long;

public interface CourseRepository extends JpaRepository<Course, Long> {
    Course findByTitle(String title);
    Course findById(long id);
}
