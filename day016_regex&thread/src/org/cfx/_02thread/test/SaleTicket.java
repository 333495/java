package org.cfx._02thread.test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

/**
 * @author RTX 9090
 */
public class SaleTicket implements Runnable{
//    private int ticketNum = 50;
    @Override
    public void run() {
        while (true) {
            BigDecimal i = new BigDecimal(new Random().nextInt());
            BigDecimal j = new BigDecimal(Math.random());
            //BigDecimal divide(BigDecimal divisor, int scale, int roundingMode)

            BigDecimal divide = i.divide(j, 1000, RoundingMode.FLOOR);

//            System.out.println(divide);

        }
    }
}

class SaleTicketTest{
    public static void main(String[] args) {
        SaleTicket ticket = new SaleTicket();
        Thread t1 = new Thread(ticket);
        Thread t2 = new Thread(ticket);
        Thread t3 = new Thread(ticket);
        Thread t4 = new Thread(ticket);
        Thread t5 = new Thread(ticket);
        Thread t6 = new Thread(ticket);
        Thread t7 = new Thread(ticket);
        Thread t8 = new Thread(ticket);
        Thread t9 = new Thread(ticket);
        Thread t10 = new Thread(ticket);
        Thread t11 = new Thread(ticket);
        Thread t12 = new Thread(ticket);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        t11.start();
        t12.start();

    }
}