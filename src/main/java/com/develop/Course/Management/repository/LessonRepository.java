package com.develop.Course.Management.repository;

import com.develop.Course.Management.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import java.lang.String;
import java.lang.Long;
import java.util.Optional;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
    Optional <Lesson> findLessonByTitle(String title);
    Optional <Lesson> findLessonById(Long id);
}
