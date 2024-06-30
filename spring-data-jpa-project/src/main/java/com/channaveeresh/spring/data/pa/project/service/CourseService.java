package com.channaveeresh.spring.data.pa.project.service;

import com.channaveeresh.spring.data.pa.project.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> findCourseById(Long courseId);
}
