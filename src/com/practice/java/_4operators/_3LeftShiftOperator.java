package com.practice.java._4operators;

public class _3LeftShiftOperator {

    public static void main(String[] args) {

        System.out.println(10 << 2);//10*2^2
        System.out.println(10 * (int) Math.pow(2, 2));//10*2^2
        System.out.println(10 << 6);//10*2^6
        System.out.println(10 * (int) Math.pow(2, 6));//10*2^6
        System.out.println(1 << 7);//1*2^7
        System.out.println(1 * (int) Math.pow(2, 7));//1*2^7
    }
}
