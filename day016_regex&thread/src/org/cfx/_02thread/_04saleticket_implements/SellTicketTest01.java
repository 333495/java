package org.cfx._02thread._04saleticket_implements;

/**
 * @author RTX 9090
 */
public class SellTicketTest01 {
    public static void main(String[] args) {
        SellTicket01 sell = new SellTicket01();
        Thread thread = new Thread(sell,"窗口一");
        Thread thread1 = new Thread(sell,"窗口二");
        Thread thread2 = new Thread(sell,"窗口三");

        thread.start();
        thread1.start();
        thread2.start();
    }

}