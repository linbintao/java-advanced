package com.java.util;

import com.sun.nio.sctp.PeerAddressChangeNotification;

import java.util.Random;

/**
 * 随机数类
 * @autho 林斌涛
 * 2019.3.12
 */

public class RandomDemo {
    public static void main(String[] args) {
        //随机生成一个5以内的随机数，包括5
        Random random = new Random();
        //[0,bound)
        int num = random.nextInt(6);
        System.out.println(num);
    }
}
