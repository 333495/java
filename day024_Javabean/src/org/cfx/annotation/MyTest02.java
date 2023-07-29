package org.cfx.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author RTX 9090
 */
public class MyTest02 {
    public static void main(String[] args) throws Exception {

        //判断是否有这个注解
        Class<User> userClass = User.class;
        for (Annotation annotation : userClass.getAnnotations()) {
            if (annotation instanceof Person) {
                System.out.println("太厉害了");
            }else {
                System.out.println("不厉害");
            }
        }

        //判断继承的类，能否也是Person
        Class<User02> user02Class = User02.class;
        Annotation[] annotations = user02Class.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof Person) {
                System.out.println("继承了");
            }else {
                System.out.println("没用继承");
            }
        }

        //判断方法是否也能继承父类的注解
        Class<User02> user02Class1 = User02.class;
        Method[] methods = user02Class1.getMethods();
        Method[] methods1 = User.class.getMethods();
        System.out.println(Arrays.equals(methods, methods1));
    }
}
