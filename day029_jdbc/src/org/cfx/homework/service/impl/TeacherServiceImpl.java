package org.cfx.homework.service.impl;

import org.cfx.homework.dao.ITeacherDao;
import org.cfx.homework.dao.impl.TeacherDaoImpl;
import org.cfx.homework.domain.Teacher;
import org.cfx.homework.service.ITeacherService;

public class TeacherServiceImpl implements ITeacherService {
    ITeacherDao teacherService = new TeacherDaoImpl();
    @Override
    public Teacher getByStudentId(long studentId) {
        return teacherService.getByStudentId(studentId);
    }
}
