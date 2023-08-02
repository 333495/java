package org.cfx._03tranfer.dao;

import org.cfx._03tranfer.domain.User;

import java.math.BigDecimal;

/**
 * @author RTX 9090
 */
public interface IUserDao {
    /**
     * 查询账户
     */
    User getUser(User user);


    /**
     * 转账
     * @param in
     * @param out
     * @param money
     * @return
     */
    boolean transfer(User in, User out, BigDecimal money);


}
