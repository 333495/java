package org.cfx.commonclass.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author RTX 9090
 */
public class ExceptionTest03 {
    public static void main(String[] args) {
//        test();
        test1();
    }

    public static void test() throws NullPointerException,ArithmeticException{

        char[] c = null;
        System.out.println(c.length);
        int i = 9 / 0;

        System.out.println("算术异常囖");

        System.out.println("空指针异常囖");

        System.out.println("我没在try里面");
    }

    public static void test1(){
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // ParseExceptio 解析异常 必须用 try-catch 或者 主动抛异常ParseExceptio
        try {
            Date date = s.parse("2023-02-29 17:20:30");
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
