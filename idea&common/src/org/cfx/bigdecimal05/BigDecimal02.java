package org.cfx.bigdecimal05;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimal02 {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("65756.343");
        BigDecimal b2 = new BigDecimal("435.232");
        System.out.println(b1);
        System.out.println(b2);
        // + - * /
        System.out.println(b1.add(b2));
        System.out.println(b1.subtract(b2));
        System.out.println(b1.multiply(b2));
        System.out.println("=======================================");
        // ArithmeticException
        // 在做除法的时候 一定要约定 保留的位数 和 取整的方式
//        System.out.println(b1.divide(b2));
        System.out.println(b1.divide(b2, 50, RoundingMode.FLOOR));
    }
}
