package org.cfx._02curd.service.Impl;

import org.cfx._02curd.dao.IUserDao;
import org.cfx._02curd.dao.Impl.UserDaoImpl;
import org.cfx._02curd.domain.User;
import org.cfx._02curd.service.IUserService;

import java.util.List;

/**
 * @author RTX 9090
 */
public class UserServiceImpl implements IUserService {
    private static final IUserDao userDaoImpl = new UserDaoImpl();

    @Override
    public int insertUser(User user) {
        return userDaoImpl.insertUser(user);
    }

    @Override
    public int deleteUser(Long id) {
        return userDaoImpl.deleteUser(id);
    }

    @Override
    public int updateUser(Long id, User user) {
        User userById = getUserById(id);
        if (userById != null) {
            return userDaoImpl.updateUser(id, user);
        }
        return 0;
    }

    @Override
    public User getUserById(Long id) {
        return userDaoImpl.getUserById(id);
    }

    @Override
    public User getUserByName(String name) {
        User userByName = userDaoImpl.getUserByName(name);
        if (userByName != null){
            return userByName;
        }
        return null;
    }

    @Override
    public List<User> getAll() {
        return userDaoImpl.getAll();

    }
}
