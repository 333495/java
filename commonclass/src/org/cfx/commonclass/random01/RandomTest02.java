package org.cfx.commonclass.random01;

import java.util.Random;

/**
 * @author RTX 9090
 */
public class RandomTest02 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println((random.nextInt(100) + 1));
        System.out.println(random.nextFloat(1,2));
    }
}
