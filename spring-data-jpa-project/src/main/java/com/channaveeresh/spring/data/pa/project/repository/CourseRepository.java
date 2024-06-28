package com.channaveeresh.spring.data.pa.project.repository;

import com.channaveeresh.spring.data.pa.project.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {

}
