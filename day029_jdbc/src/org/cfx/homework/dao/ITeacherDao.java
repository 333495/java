package org.cfx.homework.dao;

import org.cfx.homework.domain.Teacher;

/**
 * @author RTX 9090
 */
public interface ITeacherDao {
    /**
     * 根据学生ID查询对应的老师
     */
    Teacher getByStudentId(long studentId);


}
