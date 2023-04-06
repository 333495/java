package org.cfx.string02;

/**
 * @author RTX 9090
 */
public class StringBuilderTest01 {
    public static void main(String[] args) {


        StringBuilder str = new StringBuilder("hello");
        /*
            记住这个方法就行 append
         */
        System.out.println(str.append("world"));

        System.out.println(str.insert(1, 2));

        System.out.println(str.delete(1, 2));

    }
}
