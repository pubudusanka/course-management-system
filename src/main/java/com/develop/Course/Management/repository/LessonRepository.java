package com.develop.Course.Management.repository;

import com.develop.Course.Management.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
    Lesson findLessonByName(String name);
    Lesson findLessonById(Long id);
}
