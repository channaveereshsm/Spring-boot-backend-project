package com.channaveeresh.spring.data.pa.project.repository;

import com.channaveeresh.spring.data.pa.project.entity.Course;
import com.channaveeresh.spring.data.pa.project.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private  CourseMaterialRepository courseMaterialRepository;

    @Test
    public void saveCourseMaterial()
    {
        Course c=Course.builder().title("science").credit(3).build();
        CourseMaterial courseMaterial=CourseMaterial.builder().courseMaterialId(2L).url("https.sscience/notes.com").course(c).build();

   courseMaterialRepository.save(courseMaterial);
    }

    @Test
    public void printAllCourseMaterial()
    {
        List<CourseMaterial> material=courseMaterialRepository.findAll();
        System.out.println("material = " + material);
    }

}