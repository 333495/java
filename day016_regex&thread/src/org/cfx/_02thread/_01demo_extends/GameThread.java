package org.cfx._02thread._01demo_extends;

/**
 * @author RTX 9090
 * 实现线程的方式一： 继承Thread类 重写run方法
 */
public class GameThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 50;i++) {
            System.out.println("打游戏...");
        }
    }
}
