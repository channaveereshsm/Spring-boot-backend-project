package com.channaveeresh.spring.data.pa.project.repository;

import com.channaveeresh.spring.data.pa.project.entity.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {
    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void saveRepository()
    {
        Course course=Course.builder().courseId(4L).credit(2).title("social").build();

        courseRepository.save(course);
    }
    @Test
    public void printAllCourses()
    {
        List<Course> s=courseRepository.findAll();
        assertFalse(s.isEmpty());
        System.out.println("s = " + s);
    }

}