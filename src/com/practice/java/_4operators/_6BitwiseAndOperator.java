package com.practice.java._4operators;

import static com.practice.java._4operators._5LogicalAndOperator.isGreaterThanIntValue;
import static com.practice.java._4operators._5LogicalAndOperator.isLessThanIntValue;

public class _6BitwiseAndOperator {

    public static void main(String[] args) {

        //Bitwise AND operator check both boolean condition even if first condition is false or true
        int a = 10, b = 20, c = 5;

        System.out.println(isLessThanIntValue(a, b) & isGreaterThanIntValue(a, c));
        System.out.println(isLessThanIntValue(a, b) & isLessThanIntValue(a, c));
        System.out.println(isGreaterThanIntValue(a, b) & isLessThanIntValue(a, c));
        System.out.println(isGreaterThanIntValue(a, b) & isGreaterThanIntValue(a, c));

        System.out.println(a & b);
    }
}