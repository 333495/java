package org.cfx._02thread._02saleticket_extends;

/**
 * @author RTX 9090
 */
public class SellTicket03 extends Thread{
    private static int numTicket = 50;

    public SellTicket03() {
    }

    public SellTicket03(String name) {
        super(name);
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        String name = t.getName();
        while (numTicket > 0) {
            synchronized (SellTicket03.class) {
                if (numTicket > 0){
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
    }

}
