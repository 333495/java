package org.cfx.extends01;

/**
 * @author RTX 9090
 */
public class AnimalTest {
    public static void main(String[] args) {
        System.out.println(new Pig().color = "green");
        System.out.println(new Pig().name = "S");
        System.out.println(new Pig().weight = "100");
        new Pig().breath();

        Pig pig = new Pig();
        //可用直接调用publicMethod
        pig.publicMethod();
        //调用父类的静态方法时，需要用类名去调用
        Pig.staticMethod();
        pig.set("🐖");

    }
}