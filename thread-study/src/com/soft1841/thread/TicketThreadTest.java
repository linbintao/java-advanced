package com.soft1841.thread;

public class TicketThreadTest {
    public static void main(String[] args) {
        TicketThread tt1 = new TicketThread();
        tt1.start();
        TicketThread tt2 = new TicketThread();
        tt2.start();
        TicketThread tt3 = new TicketThread();
        tt3.start();
    }
}
class TicketThread extends Thread{
    private int tickets = 10;

    @Override
    public void run() {
        while (tickets>0){
            System.out.println(Thread.currentThread().getName()+"售票，当前票数："+ --tickets);
        }
    }


}
