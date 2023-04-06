package org.cfx.commonclass.random01;

import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.concurrent.ThreadLocalRandom.current;

/**
 * 设计一个方法返回随机码，包含字母和数字
 * @author RTX 9090
 */
public class Test {
    /**
        自定义常量 安全性高，方便修改
     */
    private static final String Random_CODE = "ABCDEFGHIJKMNPQRSTVWXYZ0123456789abcdefghijkmnpqrstvwxyz";

    private static final String Random_CODE1 = "abcd0123ABC";
    public static void main(String[] args) {

        //String 类型拼接
        System.out.println(getCode(10));

        //char数组
        System.out.println(getCode2(10));

        //高度随机性，线程安全,适合密码学  自定义常量方便其它地方调用
        System.out.println(getCode3(10));

        //适合高并发，高性能
        System.out.println(getCode4(10));

        //随机验证码
        System.out.println(getCode5(10));
    }

    /**
     * 方法一 ：String 类型拼接
      */

    public static String getCode(int codeLength) {
        Random random = new Random();
        String number = "23456789";
        String lowerZimu = "abcdefghijkmnpqrstvwxyz";
        String upperZimu = "ABCDEFGHIJKMNPQRSTVWXYZ";
        StringBuffer buffer = new StringBuffer();
        // 拼接
        String all = number + lowerZimu + upperZimu;
        for (int i = 0; i < codeLength; i++) {
            buffer.append(all.charAt(random.nextInt(all.length())));
        }
        return buffer.toString();
    }

    // 方法一 ：char数组
    public static String getCode2(int codeLength){
        char[] code = {'A','B','C','a','b','c','6','2','3','4','5'};
        Random random = new Random();
        System.out.println(random.nextInt(20, 30));
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < codeLength; i++) {
            stringBuilder.append(code[random.nextInt(code.length)]);
        }
        return stringBuilder.toString();
    }

    // 方法三 ：高度随机性，线程安全  自定义常量方便其它地方调用
    public static String getCode3(int codeLength) {
        SecureRandom random = new SecureRandom();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < codeLength; i++) {
            buffer.append(Random_CODE.charAt(random.nextInt(Random_CODE.length())));
        }
        return buffer.toString();
    }

    // 方法四 ：适合高并发，高性能
    public static String getCode4(int codeLength) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < codeLength; i++) {
            buffer.append(Random_CODE.charAt(random.nextInt(Random_CODE.length())));
        }
        return buffer.toString();
    }

    // 随机验证码
    public static String getCode5(int codeLength){
        ThreadLocalRandom tr = ThreadLocalRandom.current();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < codeLength; i++) {
            sb.append(Random_CODE1.charAt(tr.nextInt(Random_CODE1.length())));
        }

        return sb.toString();
    }
}
