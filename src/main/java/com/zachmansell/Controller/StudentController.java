package com.zachmansell.Controller;

import com.zachmansell.Entity.Student;
import com.zachmansell.Service.StudentService;

import java.util.Collection;

// Controller offloads requests to student service
public class StudentController {

    private StudentService studentService;

    public Collection<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
