package org.cfx.string02;

public class StringTest03 {
    public static void main(String[] args) {

        String string = "";// 表示 在堆中存在一个 空的字符串
        String string1 = null;// 表示 在栈中有一个变量为 string1 的变量 但是没有引用堆中的内存地址。
        String string2 = new String();// 表示在堆中新开辟了一个空间 存放了空字符串。


        String test = "1";
        String test1 = "1";
        String test2 = new String("1");
        System.out.println(test == test1);// true
        System.out.println(test1 == test2); //false

        System.out.println("============================");

        String test3 = "22";
        String test4 = "2" + "2";
        String test5 = new String("22");
        String test6 = "2";
        String test7 = "2" + test6;
        System.out.println(test3 == test4);// true
        System.out.println(test3 == test5);// false
        System.out.println( test3 == test7);//false
        System.out.println(test5 == test7);//false
    }
}
