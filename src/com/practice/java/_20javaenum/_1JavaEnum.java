package com.practice.java._20javaenum;

public class _1JavaEnum {

    public static void main(String args[]){
        for (Season s : Season.values())
            System.out.println(s+" "+s.getValue());

    }
}

enum Season{
    WINTER(10),SUMMER(20);
    private int value;
    Season(int value){
        this.value=value;
    }

    int getValue(){

        return this.value;
    }
}