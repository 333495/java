package org.cfx._02curd.dao.Impl;

import org.cfx._02curd.dao.IUserDao;
import org.cfx._02curd.domain.User;
import org.cfx._02curd.utils.JdbcUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author RTX 9090
 */
public class UserDaoImpl implements IUserDao {
    @Override
    public int insertUser(User user) {
        Connection conn = JdbcUtil.getConnection();
        Statement statement = null;
        int  i = 0;
        if(conn != null) {
            try {
                statement = conn.createStatement();
                i = statement.executeUpdate("insert into t_user (`name`,age,sex) values ('" + user.getUsername() + "','" + user.getAge() + "','" + user.getSex() + "')");
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                JdbcUtil.close(null,statement,conn);
            }
        }
        return i;
    }

    @Override
    public int deleteUser(Long id) {
        Connection connection = JdbcUtil.getConnection();
        Statement statement = null;
        int i = 0;
        if (connection != null) {
            try {
                statement = connection.createStatement();
                i = statement.executeUpdate("delete from t_user where id = " + id);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            JdbcUtil.close(null,statement,connection);
        }
        return i;
    }

    @Override
    public int updateUser(Long id, User user) {
        Connection connection = JdbcUtil.getConnection();
        Statement statement = null;
        int i = 0;
        if (connection != null){
            User user1 = checkID(id);
            if (user1 != null){
                try {
                    statement = connection.createStatement();
                    i = statement.executeUpdate("update t_user SET `name`= '" + user.getUsername() + "',`password` = " + user.getPassword() + " where id = " + id);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                JdbcUtil.close(null,statement,connection);
            }
        }
        return i;
    }

    @Override
    public User getUserById(Long id) {
        Connection connection = JdbcUtil.getConnection();
        if (connection != null){
            Statement statement = null;
            ResultSet resultSet = null;
            try {
                statement = connection.createStatement();
                resultSet = statement.executeQuery("select * from t_user where id=" + id);
                while (resultSet.next()) {
                    long userId = resultSet.getLong("id");
                    String userName = resultSet.getString("name");
                    int userAge = resultSet.getInt("age");
                    int userSex = resultSet.getInt("sex");
                    String userPassword = resultSet.getString("password");
                    return new User(userId, userName, userAge, userSex, userPassword);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            JdbcUtil.close(resultSet,statement,connection);
        }
        return null;
    }

    @Override
    public List<User> getAll() {
        Connection connection = JdbcUtil.getConnection();
        List<User> users = new ArrayList<>();
        if (connection != null) {
            Statement statement = null;
            ResultSet resultSet = null;
            try {
                statement = connection.createStatement();
                resultSet = statement.executeQuery("select * from t_user");
                while (resultSet.next()) {
                    long userId = resultSet.getLong("id");
                    String userName = resultSet.getString("name");
                    int userAge = resultSet.getInt("age");
                    int userSex = resultSet.getInt("sex");
                    String userPassword = resultSet.getString("password");
                    users.add(new User(userId,userName,userAge,userSex,userPassword));
                }
                return users;
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                JdbcUtil.close(resultSet,statement,connection);
            }
        }
        return null;
    }

    public User checkID(Long id){
        return getUserById(id);
    }

    @Override
    public User getUserByName(String username){
        Connection connection = JdbcUtil.getConnection();
        Statement statement = null;
        ResultSet resultSet = null;
        if (connection != null){
            try {
                statement = connection.createStatement();
                resultSet = statement.executeQuery("select * from t_user where `name` = '"+username+"'");
                while (resultSet.next()){
                    String userName = resultSet.getString("name");
                    String password = resultSet.getString("password");
                    return new User(userName,password);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            JdbcUtil.close(resultSet,statement,connection);
        }
        return null;
    }
}
