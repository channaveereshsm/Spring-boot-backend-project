package com.channaveeresh.spring.data.pa.project.repository;

import com.channaveeresh.spring.data.pa.project.SpringDataJpaProjectApplication;
import com.channaveeresh.spring.data.pa.project.entity.Course;
import com.channaveeresh.spring.data.pa.project.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = SpringDataJpaProjectApplication.class)
class CourseRepositoryTest {
    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void saveRepository() {
        Course course = Course.builder()
                .courseId(4L)
                .credit(2)
                .title("social")
                .build();
        courseRepository.save(course);
    }

    @Test
    public void printAllCourses() {
        List<Course> courses = courseRepository.findAll();
        assertFalse(courses.isEmpty());
        System.out.println("courses = " + courses);
    }

    @Test
    public void saveCourseWithTeacher() {
        Teacher teacher = Teacher.builder()
                .firstName("narayan")
                .LastName("hosuru")
                .build();
        Course course = Course.builder()
                .teacher(teacher)
                .title("Mathematics")
                .credit(4)
                .build();
        courseRepository.save(course);
    }

    @Test
    public void testFindCoursesByPage_ThirdPageWithTwoElements() {
        int page = 2;
        int pageSize = 1;
        Pageable pageable = PageRequest.of(page, pageSize);

        Page<Course> courses = courseRepository.findAll(pageable);
        int size=courses.getNumberOfElements();
        List<Course> courseList = courses.getContent();

        assertEquals(pageSize, courseList.size(), "Retrieved course list size should match page size");
        System.out.println("courseList = " + courseList);
        System.out.println("size->"+size);
    }

    @Test
    public void findAllSorting()
    {
        Pageable sortByTitle=PageRequest.of(1,3, Sort.by("title"));

        List<Course> l=courseRepository.findAll(sortByTitle).getContent();
        System.out.println("l = " + l);
                
    }
    @Test
    public void findAllSortingBycredits()
    {
        Pageable sortByCredits=PageRequest.of(0,3, Sort.by("credit"));

        List<Course> l=courseRepository.findAll(sortByCredits).getContent();
        System.out.println("l = " + l);

    }
}
