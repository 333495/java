package org.cfx.extends02;

/**
 * @author RTX 9090
 */
public class Dog extends Animal{
    public void eat(){
        System.out.println("啃骨头.....");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "weight='" + weight + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


}
