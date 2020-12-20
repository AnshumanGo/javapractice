package com.practice.java._7javainheritance;

public class _2Aggregation {

    public static void main(String[] args) {
        Circle c = new Circle();
        double result = c.area(5);
        System.out.println(result);
    }
}

class CalculationUtil {
    int square(int n) {
        return n * n;
    }
}

/*
    Code reuse is also best achieved by aggregation when there is no is-a relationship.
    Inheritance should be used only if the relationship is-a is maintained throughout
    the lifetime of the objects involved; otherwise, aggregation is the best choice.

*/
class Circle {
    CalculationUtil calculation;
    double pi = 3.14;

    double area(int radius) {
        calculation = new CalculationUtil();
        int rsquare = calculation.square(radius);
        return pi * rsquare;
    }
}