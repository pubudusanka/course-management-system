package com.develop.Course.Management.repository;

import com.develop.Course.Management.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByName(String name);
    Student findByEmail(String email);
    Student findById(long id);
}
