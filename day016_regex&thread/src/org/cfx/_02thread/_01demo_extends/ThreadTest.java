package org.cfx._02thread._01demo_extends;

/**
 * @author RTX 9090
 */
public class ThreadTest{
    public static void main(String[] args) {
        //通过无参构造 创建线程对象
        GameThread t1 = new GameThread();
        MusicThread t2 = new MusicThread();
        //启动线程 -- 调用的是 start方法
        t1.start();
        t2.start();
    }
}
