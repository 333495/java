package org.cfx._02thread._04saleticket_implements;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author RTX 9090
 */
public class SaleTicket04 implements Runnable{
    private int ticketNum = 50;
    private Lock lock = new ReentrantLock();
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        String name = thread.getName();
        while (ticketNum > 0) {
            lock.lock();
            try {
                if (ticketNum > 0) {
                    System.out.println(name+"卖票中..." + ticketNum--);
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

