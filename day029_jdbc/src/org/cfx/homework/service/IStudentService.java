package org.cfx.homework.service;

import org.cfx.homework.domain.Student;

public interface IStudentService {
    /**
     * 查询根据学生ID，查询学生的信息以及所选科目和教师
     * @param id 学号
     * @return 返回学生对象
     */
    Student selectStudentById(long id);

    /**
     * 增
     */
    void save(Student student);

    /**
     * 删
     */
    void delete(long id);

    /**
     * 改
     */
    void update(long id, Student student);
}
