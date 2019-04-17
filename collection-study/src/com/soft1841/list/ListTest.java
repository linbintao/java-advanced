package com.soft1841.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        //直接输出List对象
        System.out.println(list);
        for (int i=0,len = list.size();i<len;i++){
            System.out.println(list.get(i));
        }
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        list.forEach(s -> System.out.println(s));
    }
}
