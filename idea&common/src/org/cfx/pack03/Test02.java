package org.cfx.pack03;

public class Test02 {
    public static void main(String[] args) {
        //自动装箱
        Integer a = 1111;
        Double d = 11.0;

        //自动拆箱
        int aa = a;
        double dd = d;

        // 手动的装箱
        Integer integer = 123;
        // 手动拆箱

        int i = integer.intValue();
    }
}
