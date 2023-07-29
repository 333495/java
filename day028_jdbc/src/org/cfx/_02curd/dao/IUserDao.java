package org.cfx._02curd.dao;

import org.cfx._02curd.domain.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author RTX 9090
 */
public interface IUserDao {
    /**
     *新增用户
     * @param user 用户输入
     * @return 0 1
     */
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
