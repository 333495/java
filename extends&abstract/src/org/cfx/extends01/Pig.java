package org.cfx.extends01;

/**
 * @author RTX 9090
 * 动物类
 */
public class Pig extends Animal{


    public void set(String name) {
        staticMethod();
        super.color = "red";
        System.out.println("我叫"+name);
    }
}
