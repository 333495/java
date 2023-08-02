package org.cfx._02preparedStatemnet.service;

import org.cfx._02preparedStatemnet.domain.User;

import java.util.List;

/**
 * @author RTX 9090
 */
public interface IUserService {

    /**
     * 新增用户
     * @param user
     */
    void createUser(User user);

    /**
     * 根据用户id，删除用户
     * @param id
     */
    void deleteUser(long id);

    /**
     * 根据用户id，修改用户
     * @param id
     * @param user
     */
    void updateUser(long id,User user);

    /**
     * 根据用户id查询用户信息
     * @param id
     * @return
     */
    User getUserById(long id);

    /**
     * 查询所有用户信息
     * @return
     */
    List<User> getAll();
}
