package org.cfx._02thread._04saleticket_implements;

/**
 * @author RTX 9090
 */
public class SaleTicket03 implements Runnable{
    private int ticketNum = 50;
    @Override
    public void run() {
        while (ticketNum > 0) {
            sellOne();
        }
    }

    public synchronized void sellOne(){
        Thread thread = Thread.currentThread();
        String name = thread.getName();
        if (this.ticketNum > 0) {
            System.out.println(name+"卖票中..." + ticketNum--);
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

