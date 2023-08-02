package org.cfx._01login.dao.impl;

import org.cfx._01login.dao.IUserDao;
import org.cfx._01login.domain.User;
import org.cfx.utils.JDBCUtils;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author RTX 9090
 */
public class IUserDaoImpl implements IUserDao {
    //登录方式一：账号和密码都判断
    @Override
    public User login(String username, String password) {
        // 获取连接
        Connection connection = JDBCUtils.getConnection();
        if (connection != null) {
            Statement statement = null;
            ResultSet resultSet = null;
            try {
                statement = connection.createStatement();
                resultSet = statement.executeQuery("SELECT * FROM t_user WHERE `name` = '" + username + "' and `password` = '" + password + "'");
                while (resultSet.next()) {
                    long getId = resultSet.getLong("id");
                    String getName = resultSet.getString("name");
                    int getAge = resultSet.getInt("age");
                    int getSex = resultSet.getInt("sex");
                    String getPassword = resultSet.getString("password");
                    BigDecimal getMoney = resultSet.getBigDecimal("money");
                    return new User(getId, getName, getAge,getSex,getPassword,getMoney);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                // 关
                JDBCUtils.close(resultSet,statement,connection);
            }
        }
        return null;
    }

    //登录方式二：先判断账号再判断密码
    @Override
    public User login2(String username) {
        // 获取连接
        Connection connection = JDBCUtils.getConnection();
        if (connection != null) {
            Statement statement = null;
            ResultSet resultSet = null;
            try {
                statement = connection.createStatement();
                resultSet = statement.executeQuery("SELECT * FROM t_user WHERE `name` = '" + username + "'");
                while (resultSet.next()) {
                    long getId = resultSet.getLong("id");
                    String getName = resultSet.getString("name");
                    int getAge = resultSet.getInt("age");
                    int getSex = resultSet.getInt("sex");
                    String getPassword = resultSet.getString("password");
                    BigDecimal getMoney = resultSet.getBigDecimal("money");
                    return new User(getId, getName, getAge,getSex,getPassword,getMoney);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                // 关
                JDBCUtils.close(resultSet,statement,connection);
            }
        }
        return null;
    }

    /**
     * 获取主键
     * @param user
     */
    @Override
    public void insertUser(User user) {
        Connection connection = JDBCUtils.getConnection();
        if (connection != null) {
            Statement statement = null;
            ResultSet resultSet = null;
            try {
                statement = connection.createStatement();
                // 在sql语句中，添加参数Statement.RETURN_GENERATED_KEYS
                statement.executeUpdate("INSERT INTO t_user (`name`,`age`,`sex`,`password`,`money`) VALUES ('" + user.getUsername() + "', " + user.getAge()+","+user.getSex()+",'"+user.getPassword()+"',"+user.getMoney()+")",Statement.RETURN_GENERATED_KEYS);
                resultSet = statement.getGeneratedKeys();
                while (resultSet.next()) {
                    //这里不能获取列名，而是要获取索引
                    System.out.println(resultSet.getLong(1));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                JDBCUtils.close(resultSet,statement,connection);
            }
        }
    }
}
