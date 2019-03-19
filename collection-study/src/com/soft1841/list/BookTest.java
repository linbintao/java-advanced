package com.soft1841.list;

import java.util.ArrayList;
import java.util.List;

public class BookTest {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book(151,"红高粱",33.5));
        list.add(new Book(1,"兄弟",150.0));
        list.add(new Book(26,"墨菲定律",66.6));
        list.add(new Book(820,"基督山伯爵",65.0));
        System.out.println(list);

        list.add(2,new Book(3,"追风筝的人",99.3));
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.set(2,new Book(9,"岛",10.5));
        System.out.println(list);
        System.out.println(list.get(1));

        list.add(new Book(1,"兄弟",114.0));
        System.out.println(list);
        System.out.println(list.indexOf(new Book(1,"兄弟",15.0)));
        System.out.println(list.lastIndexOf(new Book(1,"兄弟",64.0)));
    }
}
