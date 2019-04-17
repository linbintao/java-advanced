package com.soft1841.thread;

/**
 * 3  加锁
 */
public class TicketThreadTest3 {
    public static void main(String[] args) {
        TicketThread3 tt = new TicketThread3();
        Thread thread1 = new Thread(tt,"南工院");
        Thread thread2 = new Thread(tt,"南工院2");
        Thread thread3 = new Thread(tt,"南工院3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
class TicketThread3 implements Runnable{
  private  int tickets = 10;
    @Override
    public void run() {

        while (true) {
            synchronized (this) {
                if (tickets > 0){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("中断异常");

                    }
                System.out.println(Thread.currentThread().getName() + "售票，当前票数：" + --tickets);
            }else{
                break;
            }


}}}}
