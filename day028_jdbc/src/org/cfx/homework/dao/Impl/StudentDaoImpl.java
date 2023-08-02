package org.cfx.homework.dao.Impl;

import org.cfx._02curd.domain.User;
import org.cfx.homework.dao.IStudentDao;
import org.cfx.homework.domain.Student;
import org.cfx.homework.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author RTX 9090
 */
public class StudentDaoImpl implements IStudentDao {
    @Override
    public void insertStudent(Student student) {
        Connection connection = JDBCUtils.getConnection();
        Statement statement = null;
        if (connection != null) {
            try {
                statement = connection.createStatement();
                statement.execute("INSERT INTO student (username,`password`,age,sex,intro) VALUES ('" + student.getUsername() + "','"+student.getPassword()+"',"+student.getAge()+","+student.isSex()+",'"+student.getIntro()+"')");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        JDBCUtils.close(null,statement,connection);
    }

    @Override
    public void removeStudent(long id) {
        Connection connection = JDBCUtils.getConnection();
        Statement statement = null;
        if (connection != null) {
            try {
                statement = connection.createStatement();
                statement.execute("delete from student where id="+id);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        JDBCUtils.close(null,statement,connection);
    }

    @Override
    public void updateStudent(long id, Student student) {
        Connection connection = JDBCUtils.getConnection();
        Statement statement = null;
        if (connection != null) {
            try {
                statement = connection.createStatement();
                statement.execute("update student set username = '"+student.getUsername()+"',`password` = '"+student.getPassword()+"',intro = '"+student.getIntro()+"' where id="+id);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        JDBCUtils.close(null,statement,connection);
    }

    @Override
    public Student getStudentById(long id) {
        Connection connection = JDBCUtils.getConnection();
        Statement statement = null;
        ResultSet resultSet = null;
        if (connection != null) {
            try {
                statement = connection.createStatement();
                 resultSet = statement.executeQuery("select * from Student where id=" + id);
                while (resultSet.next()) {
                    long getId = resultSet.getLong("id");
                    String getUsername = resultSet.getString("username");
                    String getPassword = resultSet.getString("password");
                    int getAge = resultSet.getInt("age");
                    boolean getSex = resultSet.getBoolean("age");
                    String getIntro = resultSet.getString("intro");

                    return new Student(getId,getUsername,getPassword,getAge,getSex,getIntro);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        JDBCUtils.close(resultSet,statement,connection);
        return null;
    }

    @Override
    public List<Student> getAll() {
        Connection connection = JDBCUtils.getConnection();
        Statement statement = null;
        ResultSet resultSet = null;
        List<Student> student = new ArrayList<>();
        if (connection != null) {
            try {
                statement = connection.createStatement();
                resultSet = statement.executeQuery("select * from Student ");
                while (resultSet.next()) {
                    long getId = resultSet.getLong("id");
                    String getUsername = resultSet.getString("username");
                    String getPassword = resultSet.getString("password");
                    int getAge = resultSet.getInt("age");
                    boolean getSex = resultSet.getBoolean("age");
                    String getIntro = resultSet.getString("intro");
                    student.add(new Student(getId,getUsername,getPassword,getAge,getSex,getIntro));
                    return student;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        JDBCUtils.close(resultSet,statement,connection);
        return null;
    }
}
