package org.cfx.extends01;

/**
 * 动物类
 * @author RTX 9090
 */
public class Animal {
    String name;
    String weight;
    String color;

    public void breath(){
        System.out.println("呼吸");
    }
    public static void staticMethod() {
        System.out.println("静态方法");
    }

    public void publicMethod() {
        System.out.println("公有方法");
    }
    private void privateMethod() {
        System.out.println("私有有方法");
    }

}
