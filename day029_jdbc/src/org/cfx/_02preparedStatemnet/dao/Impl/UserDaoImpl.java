package org.cfx._02preparedStatemnet.dao.Impl;

import org.cfx._02preparedStatemnet.dao.IUserDao;
import org.cfx._02preparedStatemnet.domain.User;
import org.cfx.utils.JDBCUtils;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author RTX 9090
 */
public class UserDaoImpl implements IUserDao {

    @Override
    public void createUser(User user) {
        // 获取连接
        Connection connection = JDBCUtils.getConnection();
        if (connection != null) {
            PreparedStatement pst = null;
            ResultSet rst = null;
            try {
                // 预编译sql
                pst = connection.prepareStatement("insert into t_user (`name`,age,sex,`password`,money) values (?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
                // 给每个 ? 占位符赋值
                pst.setObject(1,user.getUsername());
                pst.setObject(2,user.getAge());
                pst.setObject(3,user.getSex());
                pst.setObject(4,user.getPassword());
                pst.setObject(5,user.getMoney());
                pst.execute();
                rst = pst.getGeneratedKeys();
                while (rst.next()) {
                    System.out.println(rst.getLong(1));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                JDBCUtils.close(rst,pst,connection);
            }
        }
    }

    @Override
    public void deleteUser(long id) {
        Connection connection = JDBCUtils.getConnection();
        if (connection != null) {
            PreparedStatement pst = null;
            try {
                pst = connection.prepareStatement("delete from t_user where id = ?");
                pst.setObject(1,id);
                pst.execute();
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {

                JDBCUtils.close(null,pst,connection);
            }
        }
    }

    @Override
    public void updateUser(long id, User user) {
        Connection connection = JDBCUtils.getConnection();
        if (connection != null) {
            PreparedStatement pst = null;
            try {
                pst = connection.prepareStatement("update t_user set `name` = ? , age = ? , sex = ? , `password` = ? , money = ? where id = ?");
                pst.setObject(1,user.getUsername());
                pst.setObject(2,user.getAge());
                pst.setObject(3,user.getSex());
                pst.setObject(4,user.getPassword());
                pst.setObject(5,user.getMoney());
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {

                JDBCUtils.close(null,pst,connection);
            }
        }
    }

    @Override
    public User getUserById(long id) {
        Connection connection = JDBCUtils.getConnection();
        if (connection != null){
            PreparedStatement pst = null;
            ResultSet resultSet = null;
            try {
                pst = connection.prepareStatement("select * from t_user where id = ?");
                pst.setObject(1,id);
                resultSet = pst.executeQuery();
                while (resultSet.next()) {
                    long getId = resultSet.getLong("id");
                    String getName = resultSet.getString("name");
                    int getAge = resultSet.getInt("age");
                    int getSex = resultSet.getInt("sex");
                    String getPassword = resultSet.getString("password");
                    BigDecimal getMoney = resultSet.getBigDecimal("money");

                    return new User(getId,getName,getAge,getSex,getPassword,getMoney);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {

                JDBCUtils.close(resultSet,pst,connection);
            }

        }
        return null;
    }

    @Override
    public List<User> getAll() {
        Connection connection = JDBCUtils.getConnection();
        if (connection != null) {
            List<User> users = new ArrayList<>();
            PreparedStatement pst = null;
            ResultSet resultSet = null;
            try {
                pst = connection.prepareStatement("SELECT * FROM t_user");
                resultSet = pst.executeQuery();
                while (resultSet.next()) {
                    long getId = resultSet.getLong("id");
                    String getName = resultSet.getString("name");
                    int getAge = resultSet.getInt("age");
                    int getSex = resultSet.getInt("sex");
                    String getPassword = resultSet.getString("password");
                    BigDecimal getMoney = resultSet.getBigDecimal("money");
                    User user = new User(getId, getName, getAge, getSex, getPassword, getMoney);
                    users.add(user);
                }
                return users;
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {

                JDBCUtils.close(resultSet,pst,connection);
            }
        }
        return null;
    }
}
