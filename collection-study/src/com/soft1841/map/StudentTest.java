package com.soft1841.map;

import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();
        list1.add(new Student(1,"王二"));
        list1.add(new Student(4,"赵四"));
        list2.add(new Student(2,"小美"));
        list2.add(new Student(5,"小七"));

        Map<String,List<Student>> map = new HashMap<>();
        map.put("男生",list1);
        map.put("女生",list2);
        System.out.println("按性别输出的结果是：");
        Iterator<Map.Entry<String,List<Student>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,List<Student>> entry = iterator.next();
            System.out.println(entry.getKey());
            Iterator<Student> listIter = entry.getValue().iterator();
            while (listIter.hasNext()){
                System.out.println(listIter.next());
            }
        }
    }
}