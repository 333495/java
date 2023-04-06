package org.cfx._02thread._02demo_implements;

/**
 * @author RTX 9090
 *  线程的实现2种方式：
 *                 1. 继承Thread 重写run方法 创建的是 本身就是线程对象
 *                 2. 实现Runnable 接口 重写 run方法 创建的是线程对象 但是需要通过有参与构造将 实现类对象放进去
 */
public class Test {
    public static void main(String[] args) {
        // 创建线程  Thread(Runnable target)
        Thread test = new Thread(new GameThread());
        Thread test2 = new Thread(new MusicThread());
        // 启动
        test.start();
        test2.start();
    }
}
