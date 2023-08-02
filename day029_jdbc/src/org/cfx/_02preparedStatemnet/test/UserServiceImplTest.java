package org.cfx._02preparedStatemnet.test;

import org.cfx._02preparedStatemnet.domain.User;
import org.cfx._02preparedStatemnet.service.IUserService;
import org.cfx._02preparedStatemnet.service.Impl.UserServiceImpl;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * @author RTX 9090
 */
public class UserServiceImplTest {
    private static IUserService userService = new UserServiceImpl();
    @Test
    public void createUserTest(){
        userService.createUser(new User("test", 20,1,"test", BigDecimal.valueOf(20000)));
    }

}