package org.cfx._01interface;

/**
 * @author RTX 9090
 */
public class Test {
    public static void main(String[] args) {

        IAnimal animal = new IAnimal(){
            @Override
            public void eat() {
                System.out.println("food");
            }
        };
        animal.eat();
        animal.run();

    }
}
