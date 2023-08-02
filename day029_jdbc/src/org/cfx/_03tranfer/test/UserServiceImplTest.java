package org.cfx._03tranfer.test;

import org.cfx._03tranfer.domain.User;
import org.cfx._03tranfer.service.IUserService;
import org.cfx._03tranfer.service.impl.UserServiceImpl;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * @author RTX 9090
 */
public class UserServiceImplTest {
    private static IUserService userService = new UserServiceImpl();
    @Test
    public void test01(){
        // 创建两个对象
        User out = new User("John", "1234");
        User in = new User("x1x", "1231");

        if (userService.transfer(in, out,new BigDecimal(2000))){
            System.out.println("转账成功！");
        }else{
            System.out.println("转账失败！");
        }
    }

}