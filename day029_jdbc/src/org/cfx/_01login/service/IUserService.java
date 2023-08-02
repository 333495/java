package org.cfx._01login.service;

import org.cfx._01login.domain.User;

public interface IUserService {
    /**
     * 传入账号和密码
     * @param username
     * @param password
     */
    void login(String username, String password);

    /**
     * 传入账号和密码，查询user（先判断账号再判断密码）
     * @param username
     * @param password
     * @return
     */
    boolean login2(String username,String password);

    /**
     * 新增用户
     * @param user
     */
    void insertUser(User user);
}
