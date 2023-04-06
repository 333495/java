package org.cfx._02thread._02saleticket_extends;

/**
 * @author RTX 9090
 */
public class SellTicketTest02 {
    public static void main(String[] args) {


        SellTicket02 sellTicket01 = new SellTicket02("窗口一");
        SellTicket02 sellTicket02 = new SellTicket02("窗口二");
        SellTicket02 sellTicket03 = new SellTicket02("窗口三");


        sellTicket01.start();
        sellTicket02.start();
        sellTicket03.start();

    }

}