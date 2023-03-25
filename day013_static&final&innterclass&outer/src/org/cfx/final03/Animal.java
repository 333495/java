package org.cfx.final03;

/**
 * @author RTX 9090
 */
public class Animal {
    /**
     * The name of the animal
     *
     * 被final修饰的实例变量或类变量都不能再被分配值
     */
    final String name = "animal";
    final static String color = "red";

    /**
     * 不能被重写
     */
    public final void run(){
        //无法将值赋给 final 变量 'name'
//        name = "animal1111111";
        System.out.println(name + ": " + color + "跑");
    }
}
