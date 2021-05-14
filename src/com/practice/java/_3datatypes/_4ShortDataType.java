package com.practice.java._3datatypes;

public class _4ShortDataType {

    short shortOne = 221;
    short shortTwo;

    public static void main(String[] args) {

        System.out.println("Value of short data shortOne : " + new _4ShortDataType().shortOne);
        System.out.println("Default value of short data shortTwo : " + new _4ShortDataType().shortTwo);

        System.out.println("Max value of short data type : " + Short.MAX_VALUE);
        System.out.println("Min value of short data type : " + Short.MIN_VALUE);
    }
}
