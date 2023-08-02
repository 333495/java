package org.cfx.homework.dao;

import org.cfx.homework.domain.Student;

import java.util.List;

/**
 * @author RTX 9090
 */
public interface IStudentDao {
    //增
    void insertStudent(Student student);
    //删
    void removeStudent(long id);
    //改
    void updateStudent(long id, Student student);
    //根据id查
    Student getStudentById(long id);
    //查所有
    List<Student> getAll();
}
