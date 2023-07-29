package org.cfx.homework;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author RTX 9090
 */
public class MyTest {
    public static void main(String[] args) throws Exception {
        Class<User> userClass = User.class;
        /*
          1、通过反射获得指定类中的构造方法、方法、字段的方法有哪些并写出测试代码
         */
        //获取所有构造方法
        System.out.println("==============获取所有构造方法============");
        Constructor<?>[] declaredConstructors = userClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        //获取方法
        System.out.println("==============获取所有方法============");
        Method[] declaredMethods = userClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
        //获取所有字段
        System.out.println("==============获取所有字段============");
        Field[] declaredFields = userClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        /*
          2、通过反射来调用方法（私有的和非私有的都要测试）
         */
        //使用构造器创建对象
        Constructor<User> constructor = userClass.getConstructor();
        Object o = constructor.newInstance();
        System.out.println("=====调用私有的loginUser方法=======");
        //获取私有的loginUser方法
        Method loginUser = userClass.getDeclaredMethod("loginUser", String.class);
        //打开权限
        loginUser.setAccessible(true);
        //调用私有方法
        loginUser.invoke(o, "12345678");
        System.out.println("=====调用公有的setUsername方法=====");
        //调用公有的方法
        Method setUsername = userClass.getMethod("setUsername", String.class);
        //打开权限
        setUsername.setAccessible(true);
        setUsername.invoke(o, "666");
        System.out.println(o);

        /*
          3、通过反射来操作字段（私有的和非私有的都要测试）
         */
        System.out.println("=====操作公有的字段=====");
        //操作公有的字段
        //使用newInstance()创建对象
        Object user = userClass.newInstance();
        //选择要操作的字段
        Field setPassword = userClass.getField("sex");
        //赋值
        setPassword.set(user, "男");
        System.out.println(user);


        //操作私有的字段
        System.out.println("=====操作私有的字段=====");
        //使用构造器创建对象
        Constructor<User> constructor1 = userClass.getConstructor();
        Object user1 = constructor1.newInstance();
        //选择要操作的字段
        Field username = userClass.getDeclaredField("username");
        //打开权限
        username.setAccessible(true);
        //赋值
        username.set(user1, "成功");
        System.out.println(user1);

        /*
          4、通过反射验证元注解@Inherited
         */
        System.out.println("=====通过反射验证元注解=====");
        Class<User2> user2Class = User2.class;
        for (Annotation annotation : user2Class.getAnnotations()) {
            if (annotation instanceof VIP) {
                System.out.println("继承了注解");
            } else {
                System.out.println("没有继承注解");
            }
        }

    }
}

