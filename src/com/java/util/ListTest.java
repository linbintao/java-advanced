package com.java.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * List接口练习
 * @林斌涛
 */
public class ListTest {
    public static void main(String[] args) {
        //创建一个List接口的对象，元素为String类型
        List<String> list =new ArrayList<>();
        list.add("Java");
        list.add ("Html");
        list.add ("高数");
        int length  = list.size();
        System.out.println(length);
        Random random = new Random();
        int index = random.nextInt(length);
        System.out.println(index);
        System.out.println(list.get(index));
        for (int i= 0;i<length;i++){
            System.out.println(list.get(i));
        }

    }
}
