package com.soft1841.list;

import java.util.Calendar;
import java.util.Date;
/**
 * @CalendarTest
 * 林斌涛
 */
public class CalendarTest {
    public static void main(String[] args) {
        //创建Calendar对象
        Calendar C=Calendar.getInstance();
        //获取年
        int year= C.get(Calendar.YEAR);
        //获取月份
        int month= C.get(Calendar.MONTH)+1;
        //获取获取日期
        int day= C.get(Calendar.DAY_OF_MONTH);
        //获取小时
        int hour= C.get(Calendar.HOUR_OF_DAY);
        //获取分钟
        int mintute= C.get(Calendar.MINUTE);
        //获取秒
        int second= C.get(Calendar.SECOND);
        System.out.println("当前时间"+ year+"- "+month+"-"+day+" "+hour+" "+" :"+mintute+ " :"+second);
        Date date= C.getTime();
        Long time= C.getTimeInMillis();
        System.out.println("当前时间"+date);
        System.out.println("当前毫秒数"+time );

    }
}