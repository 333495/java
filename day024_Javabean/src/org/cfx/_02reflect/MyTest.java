package org.cfx._02reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author RTX 9090
 * 调用构造
 */
public class MyTest {
    public static void main(String[] args) throws Exception {
        // 获取类型对象的方法
        User user = new User();
        Class<? extends User> aClass = user.getClass();
        Class<User> userClass = User.class;
        System.out.println(aClass);
        System.out.println(userClass);

        Class<?> aClass1 = Class.forName("org.cfx._02reflect.User");    //全限定名
        System.out.println(aClass1);
        //获取对象类型2
        Object o = aClass1.newInstance();
        System.out.println(o);

        System.out.println("--------------------");
        //获取User的构造方法
        Constructor<?>[] constructors = aClass1.getConstructors();
        //获取所有公有的构造
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("=====================");
        //获取所有的构造
        for (Constructor<?> declaredConstructor : aClass1.getDeclaredConstructors()) {
            System.out.println(declaredConstructor);
        }

        //获取完后，赋值
        Constructor<?> constructor1 = aClass1.getConstructor(String.class, String.class,String.class);
        constructor1.setAccessible(true);
        Object o2 = constructor1.newInstance("1111", "1212","20");
        System.out.println(o2);


        System.out.println("====================================");
        //Declared 声明 获取类里的所有声明
        Constructor<?>[] declaredConstructors = aClass1.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }

        System.out.println("===================================");
        //调用构造方法
        Constructor<?> constructor = aClass1.getDeclaredConstructor(String.class);
        //破解访问权限
        constructor.setAccessible(true);
        Object o1 = constructor.newInstance("11111");
        System.out.println(o1);

    }
}
