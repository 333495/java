package org.cfx.pack03;

public class IntegerTest02 {
    public static void main(String[] args) {
        //最大
        System.out.println(Integer.MAX_VALUE);
        //最小
        System.out.println(Integer.MIN_VALUE);

        Integer test = 12345;
        Integer test2 = Integer.valueOf("12345");
        System.out.println(test2);

        System.out.println(Integer.max(11, 22));//最大值
        System.out.println(Integer.min(11, 22));//最小值

        int i = test.intValue();
        System.out.println(i);
        byte b = test.byteValue();
        System.out.println(b);
        System.out.println("===================================");
        int j = Integer.parseInt("12345");
        System.out.println(j);
        System.out.println(Integer.sum(1, 2));
        System.out.println(Integer.toHexString(23));
        System.out.println(Integer.valueOf("12345"));
    }
}
