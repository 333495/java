package org.cfx._01login.test;

import org.cfx._01login.domain.User;
import org.cfx._01login.service.IUserService;
import org.cfx._01login.service.impl.UserServiceImpl;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * @author RTX 9090
 */
public class UserServiceImplTest {

    private static IUserService userService = new UserServiceImpl();
    @Test
    public void testLogin1() {
        userService.login("test","test");
    }

    /**
     * 获取新增的主键
      */
    @Test
    public void test() {
        userService.insertUser(new User("x1x",20,1,"123", BigDecimal.valueOf(2000)));
    }

    @Test
    public void testLogin2() {
        System.out.println(userService.login2("test", "test"));
    }
}