package com.practice.java._3datatypes;

public class _7FloatDataType {

    float floatOne = 234.5f;
    float floatTwo;

    public static void main(String[] args) {

        System.out.println("Value of float data longOne : " + new _7FloatDataType().floatOne);
        System.out.println("Default value of float data longOne : " + new _7FloatDataType().floatTwo);

        System.out.println("Max value of float data type : " + Float.MAX_VALUE);
        System.out.println("Min value of float data type : " + Float.MIN_VALUE);
    }
}