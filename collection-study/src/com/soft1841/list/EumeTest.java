package com.soft1841.list;


import java.util.Scanner;

public class EumeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Week week = Week.getWeek(scanner.next());
        switch (week) {
            case MONDAY:
                System.out.println("MONDAY————" + week.getName()); // 获取枚举值的中文描述
                break;
            case TUESDAY:
                System.out.println("TUESDAY——" + week.getName());
                break;
            case WEDNESDAY:
                System.out.println("WEDNESDAY——" + week.getName());
                break;
            case THURSDAY:
                System.out.println("THURSDAY——" + week.getName());
                break;
            case FRIDAY:
                System.out.println("FRIDAY——" + week.getName());
                break;
            case SATURDAY:
                System.out.println("SATURDAY——" + week.getName());
                break;
            case SUNDAY:
                System.out.println("SUNDAY——" + week.getName());
                break;
            default:
                System.out.println("MONDAY————" + week.getName());
                break;
        }
    }
}