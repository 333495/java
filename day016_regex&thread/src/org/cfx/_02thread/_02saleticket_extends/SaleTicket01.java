package org.cfx._02thread._02saleticket_extends;

/**
 * @author RTX 9090
 * 卖票案例
 */
public class SaleTicket01 extends Thread{
    /**
     * 定义票数 50 张
     */
    private static int ticketNumber = 50;

    public SaleTicket01() {
        super();
    }

    public SaleTicket01(String name) {
        super(name);
    }

    /**
     * 重写 run 方法
     */
    @Override
    public void run() {
        while (ticketNumber > 0) {
            Thread t = Thread.currentThread();
            String name = t.getName();
            synchronized (SaleTicket01.class) {
                if (ticketNumber > 0){
                    System.out.println(name+"卖票中..." + ticketNumber);
                    ticketNumber--;
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
