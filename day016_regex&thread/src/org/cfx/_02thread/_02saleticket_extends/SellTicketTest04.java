package org.cfx._02thread._02saleticket_extends;

/**
 * @author RTX 9090
 */
public class SellTicketTest04 {
    public static void main(String[] args) {
        SellTicket04 sellTicket01 = new SellTicket04("窗口一");
        SellTicket04 sellTicket02 = new SellTicket04("窗口二");
        SellTicket04 sellTicket03 = new SellTicket04("窗口三");


        sellTicket01.start();
        sellTicket02.start();
        sellTicket03.start();
    }

}