package org.cfx.commonclass.random01;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author RTX 9090
 */
public class ThreadLocalRandomTest01 {
    public static void main(String[] args) {
        // 随机字符 ThreadLocalRandom 线程安全，效率高
        ThreadLocalRandom random = ThreadLocalRandom.current();
        char[] c = new char[]{'a', 'b', 'c', 'd', 'e'};
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            s.append(c[random.nextInt(c.length)]);
        }
        System.out.println(s.toString());
    }
}
