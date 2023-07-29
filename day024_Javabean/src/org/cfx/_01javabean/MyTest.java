package org.cfx._01javabean;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author RTX 9090
 */
public class MyTest {
    public static void main(String[] args) {
        User user01 = new User("test", "12121");
        User user02 = new User();

        //把user01拷贝到user02
        /*
        方法一
         */
        user02.setUsername(user01.getUsername());
        user02.setPassword(user01.getPassword());
        System.out.println(user02);
        /*
        方法二 javabean
         */


        try {
            BeanUtils.copyProperties(user02, user01);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(user02);
    }
}
