package org.cfx.homework.dao.impl;

import org.cfx.homework.dao.IStudentDao;
import org.cfx.homework.domain.Student;
import org.cfx.homework.domain.Teacher;
import org.cfx.utils.JDBCUtils;

import java.sql.*;

/**
 * @author RTX 9090
 */
public class StudentDaoImpl implements IStudentDao {
    @Override
    public Student selectStudentById(long id) {
        Connection connection = JDBCUtils.getConnection();
        if (connection != null) {
            try {
                PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM t_student WHERE stuId = ? ");
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    long getTeacherId = resultSet.getLong("teacherId");
                    String getStudentName = resultSet.getString("teacherName");
                    int getStudentSex = resultSet.getInt("subjectName");
                    return new Student(getTeacherId,getStudentName,getStudentSex);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public void save(Student student) {
        Connection conn = JDBCUtils.getConnection();
        Statement statement = null;
        int  i = 0;
        if(conn != null) {
            try {
                statement = conn.createStatement();
                i = statement.executeUpdate("insert into t_student (`stuName`,stuSex,selectedTeacherId) values ('" + student.getName() + "','" + student.getSex() + "','" + student.getSelectedTeacherId() + "')");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void delete(long id) {
        Connection connection = JDBCUtils.getConnection();
        Statement statement = null;
        int i = 0;
        if (connection != null) {
            try {
                statement = connection.createStatement();
                i = statement.executeUpdate("delete from t_student where stuId = " + id);
            } catch (SQLException e) {
                e.printStackTrace();
            }
//            JDBCUtils.close(null,statement,connection);
        }
    }

    @Override
    public void update(long id, Student student) {
        Connection connection = JDBCUtils.getConnection();
        Statement statement = null;
        int i = 0;
        if (connection != null){
            try {
                statement = connection.createStatement();
                i = statement.executeUpdate("update t_student SET `stuName`= '" + student.getName() + "',`stuSex` = " + student.getSex() + " where id = " + id);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
