package org.cfx._02thread._02saleticket_extends;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author RTX 9090
 */
public class SellTicket04 extends Thread{
    private static int numTicket = 50;
    private static Lock lock = new ReentrantLock();

    public SellTicket04() {
    }

    public SellTicket04(String name) {
        super(name);
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        String name = t.getName();
        while (numTicket > 0) {
            lock.lock();
            try {
                if (numTicket > 0){
                    System.out.println(name+"卖票中..."+numTicket);
                    numTicket--;
                }
            }finally {
                lock.unlock();
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
