package org.cfx._01login.dao;

import org.cfx._01login.domain.User;

/**
 * @author RTX 9090
 */
public interface IUserDao {

    /**
     * 传入账号和密码，查询user（账号和密码都判断）
     * @param username
     * @param password
     * @return
     */
    User login(String username, String password);


    /**
     * 传入账号和密码，查询user（先判断账号再判断密码）
     * @param username
     * @return
     */
    User login2(String username);

    /**
     * 新增用户，测试查主键
     * @param user
     */
    void insertUser(User user);
}
