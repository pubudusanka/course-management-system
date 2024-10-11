package com.develop.Course.Management.repository;

import com.develop.Course.Management.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.lang.String;
import java.util.List;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
    Optional <User> findByUsername(String username);
    Optional <User> findByEmail(String email);
    List<User> findByRole(String role);
}
