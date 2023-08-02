package org.cfx._01login.service.impl;

import org.cfx._01login.dao.IUserDao;
import org.cfx._01login.dao.impl.IUserDaoImpl;
import org.cfx._01login.domain.User;
import org.cfx._01login.service.IUserService;

/**
 * @author RTX 9090
 */
public class UserServiceImpl implements IUserService {

    private static IUserDao userDaoImpl  = new IUserDaoImpl();
    @Override
    public  void login(String username, String password) {
        User login = userDaoImpl.login(username, password);
        // 判断返回的用户是否为空
        if (login == null) {
            System.out.println("Login failed");
        }else{
            System.out.println("Login succeeded");
        }
    }

    @Override
    public boolean login2(String username,String password) {
        if (username == null || password == null){
            return false;
        }
        User user = userDaoImpl.login2(username);
        if (user != null){
            return user.getPassword().equals(password);
        }
        return false;
    }

    @Override
    public void insertUser(User user) {
        userDaoImpl.insertUser(user);
    }
}
