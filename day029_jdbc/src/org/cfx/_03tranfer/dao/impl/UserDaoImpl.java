package org.cfx._03tranfer.dao.impl;

import org.cfx._03tranfer.dao.IUserDao;
import org.cfx._03tranfer.domain.User;
import org.cfx.utils.JDBCUtils;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author RTX 9090
 */
public class UserDaoImpl implements IUserDao {
    @Override
    public User getUser(User user) {
        Connection connection = JDBCUtils.getConnection();
        if (connection != null) {
            PreparedStatement pst = null;
            ResultSet resultSet = null;
            try {
                pst = connection.prepareStatement("SELECT * FROM t_user WHERE `name`= ? and `password`= ?");
                pst.setObject(1, user.getUsername());
                pst.setObject(2, user.getPassword());
                resultSet = pst.executeQuery();
                //只查账号、密码和钱
                while (resultSet.next()) {
                    String getName = resultSet.getString("name");
                    String getPassword = resultSet.getString("password");
                    BigDecimal getMoney = resultSet.getBigDecimal("money");
                    return new User(getName,getPassword,getMoney);
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
    public boolean transfer(User in, User out, BigDecimal money) {
        // 判断传入参数是否为空
        if (in == null || out ==null || money == null){
            return false;
        }
        // 如果不为空，则执行扣钱、加钱操作。
        Connection connection = JDBCUtils.getConnection();
        if (connection != null){
            PreparedStatement pst = null;
            try {
                // 防止出现 扣钱 后 不到账的情况，开启手动提交事务。
                connection.setAutoCommit(false);
                pst = connection.prepareStatement("UPDATE t_user SET `money` = ? WHERE `name` = ?");
                pst.setObject(1, out.getMoney().subtract(money));
                pst.setObject(2,out.getUsername());
                pst.execute();

                //制造异常
//                System.out.println(1/0);

                pst.setObject(1,in.getMoney().add(money));
                pst.setObject(2,in.getUsername());
                pst.execute();

                //提交事务
                connection.commit();
                return true;
            } catch (SQLException e) {
                e.printStackTrace();
                //捕获到异常后，开启事务回滚
                try {
                    connection.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }finally {
                JDBCUtils.close(null,pst,connection);
            }
        }
        return false;
    }
}
