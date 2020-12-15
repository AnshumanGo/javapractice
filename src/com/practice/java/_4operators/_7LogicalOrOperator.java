package com.practice.java._4operators;

import static com.practice.java._4operators._5LogicalAndOperator.isGreaterThanIntValue;
import static com.practice.java._4operators._5LogicalAndOperator.isLessThanIntValue;

public class _7LogicalOrOperator {

    public static void main(String[] args) {

        int a = 10, b = 20, c = 5;

        //Logical OR operator does not check both boolean condition if first condition is true
        System.out.println(isLessThanIntValue(a, b) || isGreaterThanIntValue(a, c));
        System.out.println(isLessThanIntValue(a, b) || isLessThanIntValue(a, c));
        System.out.println(isGreaterThanIntValue(a, b) || isLessThanIntValue(a, c));
        System.out.println(isGreaterThanIntValue(a, b) || isGreaterThanIntValue(a, c));
    }
}
