package org.cfx.overridetest;

/**
 * @author RTX 9090
 */
public class Dog extends Animal{
    /**
     * 调用无参
     */
    public Dog() {
        super();
    }
    public Dog(String name){
        super(name);
    }

    @Override
    public void eat(String name) {
        System.out.println("吃骨头");
    }
}
