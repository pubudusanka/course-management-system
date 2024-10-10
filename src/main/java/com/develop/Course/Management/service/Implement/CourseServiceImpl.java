package com.develop.Course.Management.service.Implement;

import com.develop.Course.Management.dto.CourseDto;
import com.develop.Course.Management.dto.LessonDto;
import com.develop.Course.Management.dto.StudentDto;
import com.develop.Course.Management.entity.Course;
import com.develop.Course.Management.entity.Lesson;
import com.develop.Course.Management.entity.Student;
import com.develop.Course.Management.repository.CourseRepository;
import com.develop.Course.Management.service.Interface.CourseService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CourseDto addCourse(CourseDto courseDto) {
        Course course = modelMapper.map(courseDto, Course.class);
        Course savedCourse = courseRepository.save(course);
        return modelMapper.map(savedCourse, CourseDto.class);
    }

    @Override
    public CourseDto addLessonsToCourse(Long courseId, List<LessonDto> lessonDtos) {
        Optional <Course> courseOptional = courseRepository.findById(courseId);
        if (courseOptional.isPresent()) {
            Course course = courseOptional.get();
            List<Lesson> lessons = lessonDtos.stream().map(lessonDto -> modelMapper.map(lessonDto,Lesson.class)).collect(Collectors.toList());

            course.getLessons().addAll(lessons);
            for(Lesson lesson : lessons){
               lesson.setCourse(course);
            }

            Course updatedCourse = courseRepository.save(course);
            return modelMapper.map(updatedCourse, CourseDto.class);
        }else{
            throw new RuntimeException("Course not found with ID: "+ courseId);
        }
    }

    @Override
    public CourseDto updateCourseDetails(Long courseId, String newTitle) {
        Optional<Course> courseOptional = courseRepository.findById(courseId);
        if(courseOptional.isPresent()){
            Course course = courseOptional.get();
            course.setTitle(newTitle);
            return modelMapper.map(courseRepository.save(course), CourseDto.class);
        }else{
            throw new RuntimeException("Course not found with ID: "+ courseId);
        }
    }

    @Override
    public List<StudentDto> findStudentById(Long courseId) {
        List <Student> students = courseRepository.findStudentById(courseId);
        return students.stream().map(student -> modelMapper.map(student,StudentDto.class)).collect(Collectors.toList());
    }

    @Override
    public void deleteCourse(Long courseId) {
        courseRepository.deleteById(courseId);
    }

    @Override
    public CourseDto findById(Long courseId) {
        Course course = courseRepository.findById(courseId)
                .orElseThrow(() -> new RuntimeException("Course not found with ID: "+ courseId));
        return modelMapper.map(course, CourseDto.class);
    }

    @Override
    public CourseDto findByTitle(String title) {
        Course course = courseRepository.findByTitle(title);
        if (course != null) {
            return modelMapper.map(course,CourseDto.class);
        }
        throw new RuntimeException("Course not found with title: "+ title);
    }
}
