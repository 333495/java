package org.cfx._02thread._02demo_implements;

/**
 * @author RTX 9090
 * 线程实现方式二： 实现Runnable接口 重写run方法
 */
public class MusicThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {

            System.out.println("听音乐...");
        }
    }
}
