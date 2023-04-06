package org.cfx._02thread._04saleticket_implements;

/**
 * @author RTX 9090
 */
public class SaleTicket01 implements Runnable{
    private int ticketNum = 50;
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        String name = thread.getName();
        /*
            请注意，我们使用 "this" 关键字作为同步块的锁对象，因为我们正在同步 "SaleTicket01" 类的实例。
         */
        while (ticketNum > 0) {
            if (this.ticketNum > 0) {
                System.out.println(name+"卖票中..." + ticketNum--);
            }
        }
    }
}

