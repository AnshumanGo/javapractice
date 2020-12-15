package com.practice.java._5controlstatements._1ifelsestatement;

public class _4IfElseTernaryOperator {

    public static void main(String[] args) {

        int number = 13;
        //Using ternary operator
        String output = (number % 2 == 0) ? "Even number" : "Odd number";
        System.out.println(output);
    }
}
