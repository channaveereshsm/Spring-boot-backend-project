package com.channaveeresh.spring.data.pa.project.Controllers;

import com.channaveeresh.spring.data.pa.project.entity.Course;
import com.channaveeresh.spring.data.pa.project.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;
    @GetMapping("/courses/{id}")
    public List<Course> getCourseDetailsById(@PathVariable("id") Long courseId)
    {
        return courseService.findCourseById(courseId);
    }
}
