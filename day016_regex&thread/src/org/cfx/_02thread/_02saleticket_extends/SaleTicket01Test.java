package org.cfx._02thread._02saleticket_extends;

/**
 * @author RTX 9090
 */
public class SaleTicket01Test {
    public static void main(String[] args) {
        SaleTicket01 test = new SaleTicket01("窗口一");
        SaleTicket01 test1 = new SaleTicket01("窗口二");
        SaleTicket01 test2 = new SaleTicket01("窗口三");
        test.start();
        test1.start();
        test2.start();
    }
}