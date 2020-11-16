package com.practice.java._5controlstatements._1ifelseexample;

public class _3IfElseLeapYear {

    public static void main(String[] args) {

        int year=2020;
        if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){
            System.out.println("LEAP YEAR");
        }
        else{
            System.out.println("COMMON YEAR");
        }
    }
}