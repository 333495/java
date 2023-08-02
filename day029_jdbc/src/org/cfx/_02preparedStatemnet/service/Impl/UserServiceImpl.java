package org.cfx._02preparedStatemnet.service.Impl;

import org.cfx._02preparedStatemnet.dao.IUserDao;
import org.cfx._02preparedStatemnet.dao.Impl.UserDaoImpl;
import org.cfx._02preparedStatemnet.domain.User;
import org.cfx._02preparedStatemnet.service.IUserService;

import java.util.List;

/**
 * @author RTX 9090
 */
public class UserServiceImpl implements IUserService {
    private static IUserDao userDao = new UserDaoImpl();
    @Override
    public void createUser(User user) {
        userDao.createUser(user);
    }

    @Override
    public void deleteUser(long id) {
        userDao.deleteUser(id);
    }

    @Override
    public void updateUser(long id, User user) {
        userDao.updateUser(id,user);
    }

    @Override
    public User getUserById(long id) {
        return userDao.getUserById(id);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }
}
