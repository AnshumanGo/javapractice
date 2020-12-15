package com.practice.java._4operators;

public class _5LogicalAndOperator {

    public static void main(String[] args) {

        int a = 10, b = 20, c = 5;

        //Logical AND operator does not check both boolean condition if first condition is false
        System.out.println(isLessThanIntValue(a, b) && isGreaterThanIntValue(a, c));
        System.out.println(isLessThanIntValue(a, b) && isLessThanIntValue(a, c));
        System.out.println(isGreaterThanIntValue(a, b) && isLessThanIntValue(a, c));
        System.out.println(isGreaterThanIntValue(a, b) && isGreaterThanIntValue(a, c));
    }

    static boolean isGreaterThanIntValue(int a, int b) {

        return a > b;
    }

    static boolean isLessThanIntValue(int a, int b) {

        return a < b;
    }
}