package org.cfx._02thread._02saleticket_extends;

/**
 * @author RTX 9090
 */
public class SellTicket02 extends Thread{
    private static int numTicket = 50;

    public SellTicket02() {
    }

    public SellTicket02(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (numTicket > 0) {
            sellOne();
        }

    }

    public static synchronized void sellOne(){
        if (numTicket > 0){
            Thread t = Thread.currentThread();
            String name = t.getName();
            System.out.println(name+"卖票中..."+numTicket);
            numTicket--;
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
