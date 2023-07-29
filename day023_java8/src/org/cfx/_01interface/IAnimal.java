package org.cfx._01interface;

/**
 * @author RTX 9090
 */
public interface IAnimal {
    void eat();
    default void run(){
        for (int i = 0; i < 4; i++) {
            run2();
        }
        System.out.println("Animal Running");
    }

    static void run2(){
        System.out.println("Animal Running");
    }
}
