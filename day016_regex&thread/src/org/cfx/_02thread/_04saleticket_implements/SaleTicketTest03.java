package org.cfx._02thread._04saleticket_implements;

/**
 * @author RTX 9090
 */
public class SaleTicketTest03 {
    public static void main(String[] args) {
        SaleTicket03 ticket = new SaleTicket03();
        Thread t1 = new Thread(ticket,"窗口一");
        Thread t2 = new Thread(ticket,"窗口二");
        Thread t3 = new Thread(ticket,"窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}