package org.cfx.pack03;

public class Test03 {
    public static void main(String[] args) {
        Integer a = 124;
        Integer b = 124;
        Integer c = 129;

        System.out.println(a == b);// true
        System.out.println(c == b);// false


        Boolean b1 = false;
        Boolean b2 = false;
        System.out.println(b1 == b2);

        /*
            享元模式   在启动时 会先缓存一些数据 以空间换时间

            Integer Byte Short 会加载 -128~127
            Boolean 加载 true 和 false 默认是false
            Character 加载空字符
         */
    }
}
