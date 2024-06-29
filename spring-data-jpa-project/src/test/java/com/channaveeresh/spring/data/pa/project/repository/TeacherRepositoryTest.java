package com.channaveeresh.spring.data.pa.project.repository;

import com.channaveeresh.spring.data.pa.project.entity.Course;
import com.channaveeresh.spring.data.pa.project.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {
    @Autowired
    private TeacherRepository teacherRepository;
//    @Test
//    public void saveTeacher()
//    {
//        Course c=Course.builder().title("science").credit(3).build();
//        List<Course> l1=new ArrayList<>();
//        l1.add(c);
//        Teacher t=Teacher.builder().firstName("ramesh").LastName("kuravatti")..build();
//        teacherRepository.save(t);
//
//    }

}