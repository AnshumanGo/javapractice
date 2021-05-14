package com.practice.java._3datatypes;

public class _2CharDataType {

    char charOne = 'a';
    char charTwo;

    public static void main(String[] args) {

        System.out.println("Value of Character data charOne : " + new _2CharDataType().charOne);
        System.out.println("Default value of Character data charTwo : " + new _2CharDataType().charTwo);

        System.out.println("Max ascii value of Character data type : " + (int) Character.MAX_VALUE);
        System.out.println("Max value of Character data type : " + Character.MAX_VALUE);
        System.out.println("Max radix value of Character data type : " + Character.MAX_RADIX);
        System.out.println("Min ascii value of Character data type : " + (int) Character.MIN_VALUE);
        System.out.println("Min value of Character data type : " + Character.MIN_VALUE);
        System.out.println("Min radix value of Character data type : " + Character.MIN_RADIX);
    }
}