//package com.java.io;
//
//public class ThreadTest2  extends Object implements Runnable {
//    private int count = 10;
//    @Override
//    public void run() {
//        while (true) {
//            System.out.println(count + " ");
//            if (--count == 0) {
//                break;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        ThreadTest threadTest = new ThreadTest();
//        threadTest.start();
//    }
//}