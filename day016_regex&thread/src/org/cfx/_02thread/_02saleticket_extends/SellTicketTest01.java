package org.cfx._02thread._02saleticket_extends;

/**
 * @author RTX 9090
 */
public class SellTicketTest01 {
    public static void main(String[] args) {

        SellTicket01 saleTick1 = new SellTicket01("窗口一");
        SellTicket01 saleTick2 = new SellTicket01("窗口二");
        SellTicket01 saleTick3 = new SellTicket01("窗口三");


        saleTick1.start();
        saleTick2.start();
        saleTick3.start();
    }
}