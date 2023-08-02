package org.cfx.homework.service.impl;

import org.cfx.homework.dao.IStudentDao;
import org.cfx.homework.dao.impl.StudentDaoImpl;
import org.cfx.homework.domain.Student;
import org.cfx.homework.service.IStudentService;

public class StudentServiceImpl implements IStudentService {
    IStudentDao studentDao = new StudentDaoImpl();
    @Override
    public Student selectStudentById(long id) {
        return studentDao.selectStudentById(id);
    }

    @Override
    public void save(Student student) {
        studentDao.save(student);
    }

    @Override
    public void delete(long id) {
        studentDao.delete(id);
    }

    @Override
    public void update(long id, Student student) {
        studentDao.update(id, student);
    }
}
