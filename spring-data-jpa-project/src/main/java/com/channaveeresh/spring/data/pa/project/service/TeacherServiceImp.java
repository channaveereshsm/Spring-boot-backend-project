package com.channaveeresh.spring.data.pa.project.service;

import com.channaveeresh.spring.data.pa.project.entity.Teacher;
import com.channaveeresh.spring.data.pa.project.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceImp implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;
    @Override
    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public List<Teacher> fetchAllTeacher() {
        return teacherRepository.findAll();
    }

    @Override
    public void deleteDepartmentById(Long teacherId) {
        teacherRepository.deleteById(teacherId);
    }

    @Override
    public Optional<Teacher> getTeacherById(Long teacherId) {
        return teacherRepository.findById(teacherId);
    }




    @Override
    public Optional<Teacher> getTeacherByName(String teacherName) {
        return teacherRepository.getTecherByName(teacherName);
    }
}
