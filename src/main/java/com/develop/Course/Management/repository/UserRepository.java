package com.develop.Course.Management.repository;

import com.develop.Course.Management.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.lang.String;
import java.util.List;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findByEmail(String email);
    List<User> findByRole(String role);
}
