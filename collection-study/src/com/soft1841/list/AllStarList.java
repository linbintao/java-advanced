package com.soft1841.list;
/**
 * Comparable接口练习
 * @林斌涛
 * 3.20
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllStarList {
    public static void main(String[] args) {
        //创建List对象
        List<AllStar> list = new ArrayList<>();
        list.add(new AllStar("詹姆斯",23));
        list.add(new AllStar("欧文",11));
        list.add(new AllStar("罗斯",1));
        list.add(new AllStar("韦德",3));
        list.add(new AllStar("姚明",13));
        //调用collection的sort方法
        Collections.sort(list);
        //foreach循环
        for (AllStar allStar :list){
            System.out.println("球星姓名:" +allStar.getName()+"   "+"球衣号码:"+allStar.getNumber());
        }

    }
}
