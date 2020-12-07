package com.zachmansell.Service;

import com.zachmansell.Dao.StudentDao;
import com.zachmansell.Entity.Student;

import java.util.Collection;

// Service that uses the database
public class StudentService {

    private StudentDao studentDao;

    public Collection<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }
}
