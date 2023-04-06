package org.cfx.string02;

/**
 * @author RTX 9090
 */
public class StringBufferTest01 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("hello");
        /*
            记住这个方法就行 append
         */
        System.out.println(str.append("world"));

        System.out.println(str.insert(1, 3));

        System.out.println(str.delete(1, 3));



        /*
            String 和 StringBuffer 和 StringBuilder 的区别
            String是不可变数组，StringBuffer、StringBuilder可变
            StringBuffer 默认容量是16，扩容机制是 原来的长度*2+2,线程不安全
            StringBuilder 默认容量是16，扩容机制是 原来的长度*2+2,线程不安全

         */



    }
}
