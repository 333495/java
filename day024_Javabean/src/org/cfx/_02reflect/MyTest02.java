package org.cfx._02reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author RTX 9090
 *
 * 调用方法
 */
public class MyTest02 {
    public static void main(String[] args) throws Exception {
        //获取全部类中的方法
        Class<?> aClass = Class.forName("org.cfx._02reflect.User");
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        //创建无参对象
        Object o = aClass.newInstance();
        //使用构造器创建对象
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Object o1 = declaredConstructor.newInstance();


        Method login = aClass.getMethod("login", String.class, String.class);
        //调用方法
        login.invoke(o1,"123","1234");

        System.out.println("===============调用私有方法=================");
        //调用私有方法
//        Method[] declaredMethods = aClass.getDeclaredMethods();
//        for (Method declaredMethod : declaredMethods) {
//            System.out.println(declaredMethod);
//        }
        Method login1 = aClass.getDeclaredMethod("login", String.class);
        //打开权限
        login1.setAccessible(true);
        //调用方法
        login1.invoke(o,"123123");

        System.out.println("===============调用公有方法=================");
        Method login2 = aClass.getMethod("login", String.class, String.class);
        login2.invoke(o,"3333","3333");

    }
}
