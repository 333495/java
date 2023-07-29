package org.cfx._05optional;

import java.util.Objects;
import java.util.Optional;

/**
 * @author RTX 9090
 */
public class OptionalTest {
    public static void main(String[] args) {
        User user = new User("LISI","1223");
        Optional<User> test = Optional.of(user);
        System.out.println(test.isPresent());
        System.out.println(user.getPassword());

        // 如果对象中有值就返回值，没有值就创建一个空的对象
        System.out.println(Optional.ofNullable(user));

        // 判断是否有值
        System.out.println(Optional.ofNullable(user).isPresent());

        // 判断是否有值，没有值就返回 一个自定义内容
        System.out.println(Optional.ofNullable(user).map(u -> u.getPassword()).orElse("为空"));

        System.out.println(getPassword(user));

        System.out.println(getPwd(user));
    }

    //获取密码1
    public static String getPassword(User user) {
        //1、传统方式
        if (user == null) {
            return "密码为空！";
        }
        //2、高级
        if (Objects.isNull(user)){
            return "密码为空！";
        }
        //3、优雅
        if (!Optional.ofNullable(user).isPresent()){
            return "密码为空";
        }
        return user.getPassword();
    }

    //获取密码2
    public static String getPwd(User user) {
        return Optional.ofNullable(user).map(User::getPassword).orElse("密码为空！");
    }
}
