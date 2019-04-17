package com.soft1841.set;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Set接口基础程序
 */

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
       set.add("C");
       set.add("A");
        System.out.println("直接输出set集合");
        System.out.println(set);

        //用for循环遍历set集合
        System.out.println("for循环遍历结果");
        Object[] array = set.toArray();
        for (int i =0,len = array.length;i<len;i++) {
            System.out.println();

        }
        //用Iterator迭代器遍历set集合
        System.out.println("Iterator迭代器遍历结果");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + "  ");
        }
        //用Lambda
        set.forEach(s -> System.out.print(s+"  "));

    }
}
