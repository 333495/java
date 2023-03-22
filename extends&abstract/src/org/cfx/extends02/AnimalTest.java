package org.cfx.extends02;


/**
 * @author RTX 9090
 */
public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Pig pig = new Pig();
        dog.setName("Dog");
        dog.setColor("red");
        dog.setWeight("10kg");
        System.out.println(dog.getName());
        System.out.println(dog.getColor());
        System.out.println(dog.getWeight());
        dog.eat();
        System.out.println("============================");
        Pig.setSex("公");
        System.out.println(Pig.getSex());
        pig.sleep();


    }

}