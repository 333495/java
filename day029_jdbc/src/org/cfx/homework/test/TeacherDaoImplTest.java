package org.cfx.homework.test;

import org.cfx.homework.dao.IStudentDao;
import org.cfx.homework.dao.ITeacherDao;
import org.cfx.homework.dao.impl.StudentDaoImpl;
import org.cfx.homework.dao.impl.TeacherDaoImpl;
import org.cfx.homework.service.IStudentService;
import org.cfx.homework.service.ITeacherService;
import org.cfx.homework.service.impl.StudentServiceImpl;
import org.cfx.homework.service.impl.TeacherServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author RTX 9090
 */
public class TeacherDaoImplTest {
    ITeacherService teacherService = new TeacherServiceImpl();
    IStudentService studentService = new StudentServiceImpl();
    @Test
    public void getByStudentId() {
        System.out.println(teacherService.getByStudentId(1L));
    }
    @Test
    public void deleteStudent(){
        studentService.delete(1L);
    }
}