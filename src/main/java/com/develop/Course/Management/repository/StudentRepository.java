package com.develop.Course.Management.repository;

import com.develop.Course.Management.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.lang.String;
import java.lang.Long;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional <Student> findByName(String name);
    Optional <Student> findByEmail(String email);
    Optional <Student> findById(long id);
}
