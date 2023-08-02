package org.cfx.homework.service;

import org.cfx.homework.domain.Teacher;

public interface ITeacherService {
    /**
     * 根据学生ID查询对应的老师
     */
    Teacher getByStudentId(long studentId);
}
