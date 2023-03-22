package org.cfx.overridetest;

/**
 * @author RTX 9090
 * 动物类
 */
public class Animal {
    private String name;
    public String name1;

    public Animal() {
    }

    public Animal(String name, String name1) {
        this.name = name;
        this.name1 = name1;
    }

    public Animal(String name) {
        this.name = name;
    }
    public void eat(String name){
        System.out.println("吃吃吃"+name);
    }
}
