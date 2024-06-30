package com.channaveeresh.spring.data.pa.project.Controllers;

import com.channaveeresh.spring.data.pa.project.entity.Teacher;
import com.channaveeresh.spring.data.pa.project.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @Autowired // Ensure dependency injection
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping("/teacher") // Already specified, remove redundant @RequestMapping
    public Teacher saveTeacher(@RequestBody Teacher teacher) {
        return teacherService.saveTeacher(teacher);
    }
    @GetMapping("/teacher")
    public List<Teacher> getTeacher()
    {
        return teacherService.fetchAllTeacher();
    }
    @DeleteMapping("/deleteTeacher/{Id}")
    public String DeleteDepartmentById(@PathVariable("Id") Long taecherId)
    {
        teacherService.deleteDepartmentById(taecherId);
        return "teacher is deleted successfully";

    }

}
