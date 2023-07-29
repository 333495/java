package org.cfx.annotation;

import java.util.HashMap;

/**
 * @author RTX 9090
 * Java 四大注解
 * @Ovrride 重写
 * @Deprecated 过时
 * @SuppressWarnings 抑制编译器警告
 * @SafeVarargs 抑制警告
 *
 * 元注解 组成注解的注解
 * Target 注解可以用在什么地方
 * Retention 定义注解作用于什么时候 Runtime > Class > Source
 * @Documented 该注解是否需要导出为文档
 * @Inherited 可以被继承 类可以被继承，子类如果没用重写父类方法，可以继承
 *                                    如果重写了，那就继承不了了
 */
public class MyTest {
    //镇压警告
    @SuppressWarnings("all")
    public static void main(String[] args) {
        User user = new User();
        user.login("123","admin");

        HashMap map = new HashMap();
    }
}
