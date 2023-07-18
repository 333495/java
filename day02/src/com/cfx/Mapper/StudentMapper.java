package com.cfx.Mapper;

import com.cfx.Student.Student;

import java.util.List;

/**
 * @author RTX 9090
 */
public interface StudentMapper {
    List<Student> selectAll();
    void addStudent();
    void deleteStudent();
}
