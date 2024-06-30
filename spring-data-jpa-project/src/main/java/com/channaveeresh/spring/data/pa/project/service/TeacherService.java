package com.channaveeresh.spring.data.pa.project.service;

import com.channaveeresh.spring.data.pa.project.entity.Teacher;

import java.util.List;

public interface TeacherService {

    Teacher saveTeacher(Teacher teacher);
    List<Teacher> fetchAllTeacher();
    void deleteDepartmentById(Long teacherId);
}
