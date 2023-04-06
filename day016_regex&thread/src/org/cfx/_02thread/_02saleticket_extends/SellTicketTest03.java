package org.cfx._02thread._02saleticket_extends;

/**
 * @author RTX 9090
 */
public class SellTicketTest03 {
    public static void main(String[] args) {
        SellTicket03 sellTicket01 = new SellTicket03("窗口一");
        SellTicket03 sellTicket02 = new SellTicket03("窗口二");
        SellTicket03 sellTicket03 = new SellTicket03("窗口三");


        sellTicket01.start();
        sellTicket02.start();
        sellTicket03.start();
    }

}