package org.cfx.homework.service.Impl;

import org.cfx.homework.dao.IStudentDao;
import org.cfx.homework.dao.Impl.StudentDaoImpl;
import org.cfx.homework.domain.Student;
import org.cfx.homework.service.IStudentService;

import java.util.List;

/**
 * @author RTX 9090
 */
public class StudentServiceImpl implements IStudentService {
    private static final IStudentDao studentDaoImpl = new StudentDaoImpl();
    @Override
    public void insertStudent(Student student) {
        studentDaoImpl.insertStudent(student);
    }

    @Override
    public void removeStudent(long id) {
        studentDaoImpl.removeStudent(id);
    }

    @Override
    public void updateStudent(long id, Student student) {
        studentDaoImpl.updateStudent(id, student);
    }

    @Override
    public Student getStudentById(long id) {
        return studentDaoImpl.getStudentById(id);
    }

    @Override
    public List<Student> getAll() {
        return studentDaoImpl.getAll();
    }
}
