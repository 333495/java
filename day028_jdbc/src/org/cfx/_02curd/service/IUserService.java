package org.cfx._02curd.service;

import org.cfx._02curd.domain.User;

import java.util.List;

/**
 * @author RTX 9090
 */
public interface IUserService {

    int insertUser(User user);
    /**
     * 删除用户
     * @param id 用户id
     */
    int deleteUser(Long id);


    int updateUser(Long id, User user);

    User getUserById(Long id);

    User getUserByName(String name);

    List<User> getAll();
}
