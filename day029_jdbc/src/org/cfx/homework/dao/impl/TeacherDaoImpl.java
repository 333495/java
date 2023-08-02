package org.cfx.homework.dao.impl;

import org.cfx.homework.dao.ITeacherDao;
import org.cfx.homework.domain.Teacher;
import org.cfx.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author RTX 9090
 */
public class TeacherDaoImpl implements ITeacherDao {
    @Override
    public Teacher getByStudentId(long studentId) {
        Connection connection = JDBCUtils.getConnection();
        if (connection != null) {
            try {
                PreparedStatement preparedStatement = connection.prepareStatement("SELECT t1.* FROM t_teacher t1,t_student t2 WHERE t1.teacherId = t2.selectedTeacherId ");
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    long getTeacherId = resultSet.getLong("teacherId");
                    String getTeacherName = resultSet.getString("teacherName");
                    String getSubjectName = resultSet.getString("subjectName");
                    return new Teacher(getTeacherId,getTeacherName,getSubjectName);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
