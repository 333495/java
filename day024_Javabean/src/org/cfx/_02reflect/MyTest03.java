package org.cfx._02reflect;

import java.lang.reflect.Field;

/**
 * @author RTX 9090
 * 获取字段，并修改值
 */
public class MyTest03 {
    public static void main(String[] args) throws Exception {
        //获取字段（公有属性）
        Class<?> aClass = Class.forName("org.cfx._02reflect.User");
//        Field[] fields = aClass.getFields();
//        for (Field field : fields) {
//            System.out.println(field);
//        }
        //获取字段（所有属性）
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        //创建User对象
        Object o = aClass.newInstance();
        // 获取指定的私有字段
        Field username = aClass.getDeclaredField("username");
        //打开权限
        username.setAccessible(true);
        //写入值
        username.set(o,"123456789");
        System.out.println(username.get(o));

        Field age = aClass.getField("age");
        age.setAccessible(true);
        age.set(o,"28");
        System.out.println(age.get(o));


        System.out.println("--------------------------------");
        // 拿到的都是同一个对象
        Class<?> aClass1 = Class.forName("java.lang.String");
        System.out.println(aClass1);

        Class<? extends String> aClass2 = "abc".getClass();

        Class<String> stringClass = String.class;

        //true
        System.out.println(stringClass == aClass2);
        //true
        System.out.println(aClass2 == aClass1);

    }
}
