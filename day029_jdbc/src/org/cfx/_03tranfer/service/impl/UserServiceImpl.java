package org.cfx._03tranfer.service.impl;

import org.cfx._03tranfer.dao.IUserDao;
import org.cfx._03tranfer.dao.impl.UserDaoImpl;
import org.cfx._03tranfer.domain.User;
import org.cfx._03tranfer.service.IUserService;

import java.math.BigDecimal;

/**
 * @author RTX 9090
 */
public class UserServiceImpl implements IUserService {
    private static IUserDao userDao = new UserDaoImpl();
    @Override
    public User getUser(User user) {
        return userDao.getUser(user);
    }

    @Override
    public boolean transfer(User in, User out, BigDecimal money) {
        if (in == null || out == null || money == null){
            return false;
        }
        // 可以少进行一次sql查询
        in = userDao.getUser(in);
//        if (in ==null){
//            return false;
//        }
        out = userDao.getUser(out);
        if (out == null){
            return false;
        }
        if (out.getMoney().compareTo(money) < 0 ){
            return false;
        }
        return userDao.transfer(in,out,money);
    }
}
