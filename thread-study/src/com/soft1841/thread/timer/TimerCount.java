package com.soft1841.thread.timer;



public class TimerCount extends Thread {
    @Override
    public void run(){
        for (int i = 5; i > -1; i--){
            System.out.println(i);
            if (i <= 0){
                System.out.println("节目开始");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("开始倒数");
        Thread thread = new Thread();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        TimerCount timerCount = new TimerCount();
        timerCount.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}