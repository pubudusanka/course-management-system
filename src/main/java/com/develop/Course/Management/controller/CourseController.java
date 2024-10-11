package com.develop.Course.Management.controller;

import com.develop.Course.Management.dto.CourseDto;
import com.develop.Course.Management.dto.LessonDto;
import com.develop.Course.Management.dto.StudentDto;
import com.develop.Course.Management.service.Interface.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
/*@CrossOrigin(origins = "http://localhost:5173")*/
public class CourseController {

    @Autowired
    private CourseService courseService;

    // Add a new course (courseId, courseTitle)
    @PostMapping("/add")
    public CourseDto addCourse(@RequestBody CourseDto courseDto) {
        return courseService.addCourse(courseDto);
    }

    // Add lessons to a course by course ID
    @PostMapping("/{courseId}/lessons/add")
    public CourseDto addLessonsToCourse(@PathVariable Long courseId, @RequestBody List <LessonDto> lessons) {
        return courseService.addLessonsToCourse(courseId, lessons);
    }

    // Update course details
    @PutMapping("/{courseId}/update")
    public CourseDto updateCourseDetails(@PathVariable Long courseId, @RequestBody CourseDto courseDto) {
        return courseService.updateCourseDetails(courseId, String.valueOf(courseDto));
    }

    // Delete course by ID
    @DeleteMapping("/{courseId}/delete")
    public String deleteCourse(@PathVariable Long courseId) {
        courseService.deleteCourse(courseId);
        return "Course with ID " + courseId + " has been deleted";
    }

    // Find course by ID
    @GetMapping("/{id}")
    public CourseDto findById(@PathVariable Long id) {
        return courseService.findById(id);
    }

    // Find course by title
    @GetMapping("/title/{title}")
    public CourseDto findByTitle(@PathVariable String title) {
        return courseService.findByTitle(title);
    }

    // Get students enrolled in the course by course ID
    @GetMapping("/{courseId}/students")
    public List<StudentDto> findStudentById(@PathVariable Long courseId) {
        return courseService.findStudentById(courseId);
    }
}
