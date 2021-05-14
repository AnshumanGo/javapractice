package com.practice.java._3datatypes;

public class _6LongDataType {

    long longOne = 1200L;
    long longTwo;

    public static void main(String[] args) {

        System.out.println("Value of int data longOne : " + new _6LongDataType().longOne);
        System.out.println("Default value of int data longOne : " + new _6LongDataType().longTwo);

        System.out.println("Max value of long data type : " + Long.MAX_VALUE);
        System.out.println("Min value of long data type : " + Long.MIN_VALUE);
    }
}
