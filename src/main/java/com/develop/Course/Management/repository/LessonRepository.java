package com.develop.Course.Management.repository;

import com.develop.Course.Management.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import java.lang.String;
import java.lang.Long;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
    Lesson findLessonByTitle(String title);
    Lesson findLessonById(Long id);
}
