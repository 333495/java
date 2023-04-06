package org.cfx.string02;

public class StringBuilderTest02 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        /*
            记住这个方法就行 append
         */
        System.out.println(str.append("world"));

        System.out.println(str.insert(1, 3));

        System.out.println(str.delete(1, 3));
    }
}
