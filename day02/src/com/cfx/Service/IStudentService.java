package com.cfx.Service;

import com.cfx.Student.Student;

import java.util.List;

public interface IStudentService {
    List<Student> selectAll();
    void addStudent();
    void deleteStudent();
}
