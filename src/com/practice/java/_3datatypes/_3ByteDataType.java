package com.practice.java._3datatypes;

public class _3ByteDataType {

    byte byteOne = 12;
    byte byteTwo;

    public static void main(String[] args) {

        System.out.println("Value of byte data byteOne : " + new _3ByteDataType().byteOne);
        System.out.println("Default value of byte data byteTwo : " + new _3ByteDataType().byteTwo);

        System.out.println("Max value of byte data type : " + Byte.MAX_VALUE);
        System.out.println("Min value of byte data type : " + Byte.MIN_VALUE);
    }
}
