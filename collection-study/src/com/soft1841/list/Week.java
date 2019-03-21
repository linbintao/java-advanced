package com.soft1841.list;


import java.util.Scanner;

/**
 * 枚举类
 * @author 林斌涛
 * 2019/3/21aa
 */
enum Week {
    MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"), THURSDAY("星期四"), FRIDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期日");
    String week;

    Week(String week) {
        this.week = week;
    }

    public String getName() {
        return week;
    }

    public static Week getWeek(String week) {
        switch (week) {
            case "mon":
                return Week.MONDAY;
            case "tues":
                return Week.TUESDAY;
            case "wed":
                return Week.WEDNESDAY;
            case "thru":
                return Week.THURSDAY;
            case "fri":
                return Week.FRIDAY;
            case "sat":
                return Week.SATURDAY;
            case "sun":
                return Week.SUNDAY;
            default:
                return Week.MONDAY;
        }
    }
}
