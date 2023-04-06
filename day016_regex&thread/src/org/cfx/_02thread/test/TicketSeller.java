package org.cfx._02thread.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TicketSeller implements Runnable {
    private static int tickets = 50;

    public TicketSeller(int tickets) {

    }

    public TicketSeller() {

    }

    @Override
    public void run() {
        while (tickets > 0) {
            sellTicket();
        }
    }

    private synchronized void sellTicket() {
        if (tickets > 0) {
            System.out.println(Thread.currentThread().getName() + " sold ticket " + tickets);
            tickets--;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        TicketSeller seller = new TicketSeller();
        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.execute(seller);
        executor.execute(seller);
        executor.execute(seller);
        executor.shutdown();
    }
}
