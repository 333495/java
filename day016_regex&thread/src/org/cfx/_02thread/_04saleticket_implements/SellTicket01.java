package org.cfx._02thread._04saleticket_implements;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author RTX 9090
 */
public class SellTicket01 implements Runnable{
    private int sellTicketNum = 50;
    private Lock lock = new ReentrantLock();
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        String name = t.getName();
        while (sellTicketNum > 0){
            lock.lock();
            try {
                if (sellTicketNum > 0){
                    System.out.println(name+"卖票..."+sellTicketNum);
                    sellTicketNum--;
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
