package org.cfx.commonclass.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author RTX 9090
 */
public class ExceptionTest04 {
    public static void main(String[] args) {
//        test();
        test1();
    }

    public static void test() throws NullPointerException,ArithmeticException{

        /**
         * 不建议使用 throws 抛出异常
         */
        char[] c = null;
        System.out.println(c.length);
        int i = 9 / 0;

        System.out.println("快来执行我啊");
    }

    public static void test1(){
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // ParseExceptio 解析异常 必须用 try-catch 或者 主动抛异常ParseExceptio
        try {
            Date date = s.parse("2023-12-22 22:23:32");
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
