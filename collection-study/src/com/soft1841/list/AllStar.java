package com.soft1841.list;

public class AllStar implements Comparable<AllStar> {
    private String name;
    private Integer number;

    public AllStar(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public int compareTo(AllStar allStar) {
        return this.getNumber() - allStar.getNumber();
    }
}
