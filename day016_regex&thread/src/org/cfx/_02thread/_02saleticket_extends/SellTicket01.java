package org.cfx._02thread._02saleticket_extends;

/**
 * @author RTX 9090
 */
public class SellTicket01 extends Thread{

    private static int tickNum = 50;

    public SellTicket01() {
    }

    public SellTicket01(String name) {
        super(name);
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        String name = t.getName();
        while (tickNum > 0) {
            System.out.println(name+"卖票中..." + tickNum--);
        }
    }
}

