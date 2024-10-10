package com.develop.Course.Management.service.Interface;

import com.develop.Course.Management.dto.CourseDto;
import com.develop.Course.Management.dto.LessonDto;
import com.develop.Course.Management.dto.StudentDto;

import java.util.List;

public interface CourseService {
    CourseDto addCourse(CourseDto course);
    CourseDto addLessonsToCourse(Long courseId, List <LessonDto> lessonDtos);
    CourseDto updateCourseDetails(Long courseId, String newTitle);
    List <StudentDto> findStudentById(Long courseId);
    void deleteCourse(Long courseId);
    CourseDto findById(Long courseId);
    CourseDto findByTitle(String title);
}
