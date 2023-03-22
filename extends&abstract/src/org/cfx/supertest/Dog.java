package org.cfx.supertest;

import org.cfx.overridetest.Animal;

/**
 * @author RTX 9090
 */
public class Dog extends Animal {
    /**
     * 调用无参
     */
    public Dog() {
        super();
    }
    public Dog(String name){
        super(name);
    }
    public void setName(String name){
        this.name1 = name;
    }

    @Override
    public void eat(String name) {
        super.eat(name);
        super.name1 = "Dog";
        System.out.println("吃骨头"+name1);
    }
}
