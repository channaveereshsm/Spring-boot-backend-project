package com.channaveeresh.spring.data.pa.project.service;

import com.channaveeresh.spring.data.pa.project.entity.Course;
import com.channaveeresh.spring.data.pa.project.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CourseServiceImp implements CourseService {


    @Autowired
   private CourseRepository courseRepository;
    @Override
    public List<Course> findCourseById(Long courseId) {
        return courseRepository.findAllById(Collections.singleton(courseId));
    }
}
