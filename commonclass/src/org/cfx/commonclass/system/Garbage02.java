package org.cfx.commonclass.system;

/**
 * @author RTX 9090
 */
public class Garbage02 {
    static int i = 1;
    @Override
    protected void finalize() throws Throwable {
        System.out.println("我被回收了"+i+"次");
        i++;
    }
}
class Garbage{
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Garbage02();
        }
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}