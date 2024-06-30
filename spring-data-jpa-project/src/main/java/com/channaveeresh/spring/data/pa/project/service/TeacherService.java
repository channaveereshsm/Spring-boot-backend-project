package com.channaveeresh.spring.data.pa.project.service;

import com.channaveeresh.spring.data.pa.project.entity.Teacher;

import java.util.List;
import java.util.Optional;

public interface TeacherService {

    Teacher saveTeacher(Teacher teacher);
    List<Teacher> fetchAllTeacher();
    void deleteDepartmentById(Long teacherId);
    Optional<Teacher> getTeacherById(Long teacherId);


    Optional<Teacher> getTeacherByName(String teacherName);
}
