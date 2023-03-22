package com.cfx.Mapper;

import com.cfx.Student.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> selectAll();
    void addStudent();
    void deleteStudent();
}
