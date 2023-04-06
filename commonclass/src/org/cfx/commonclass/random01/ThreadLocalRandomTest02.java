package org.cfx.commonclass.random01;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author RTX 9090
 */
public class ThreadLocalRandomTest02 {
    public static void main(String[] args) {
        // 随机字符 ThreadLocalRandom 线程安全，效率高
        ThreadLocalRandom test = ThreadLocalRandom.current();
        char[] random = {'a', '1','2','3','m','n','o'};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < random.length; i++) {
            sb.append(random[test.nextInt(random.length)]);
        }
        System.out.println(sb.toString());
    }
}
