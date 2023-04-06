package org.cfx.math04;

import java.math.BigDecimal;

public class Math02 {
    public static void main(String[] args) {
        //和
        System.out.println(Math.addExact(1111, 2111));
        // 求绝对值
        System.out.println(Math.abs(1));
        //ceil 向上取整 向着最大的值
        System.out.println(Math.ceil(1212112.2));
        //floor 向下取整 向着最小的值
        System.out.println(Math.floor(1212112.9999));

        //四舍五入
        System.out.println(Math.round(3.43399));
        System.out.println(Math.round(4.9999999));
    }
}
