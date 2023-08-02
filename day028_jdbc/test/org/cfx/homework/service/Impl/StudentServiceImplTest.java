package org.cfx.homework.service.Impl;

import org.cfx.homework.domain.Student;
import org.cfx.homework.service.IStudentService;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentServiceImplTest {

    private static final IStudentService studentService = new StudentServiceImpl();
    //1.新增
    @Test
    public void insertStudentTest(){
        studentService.insertStudent(new Student("cxk","123",30,true,"练习两年半！"));
    }
    //2.删除
    @Test
    public void removeStudentTest(){
        studentService.removeStudent(1L);
    }
    //3.修改
    @Test
    public void updateStudentTest(){
        studentService.updateStudent(2L,new Student("xhz","123",25,true,"中分头，背带裤！"));
    }
    //4.根据id查学生
    @Test
    public void getStudentById(){
        System.out.println(studentService.getStudentById(2L));
    }
    //5.查询所有
    @Test
    public void getAllTest(){
        System.out.println(studentService.getAll());
    }
}