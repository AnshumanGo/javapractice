package com.practice.java._8javapolymorphism;

public class _1MethodOverloadingStaticPolymorphism {

    static int add(int a, int b) {
        return a + b;
    }

    //changing number of arguments
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    //changing data type of arguments
    static double add(double a, double b) {
        return a + b;
    }

    //Method Overloading with TypePromotion
    static void sum(int a, long b) {
        System.out.println(a + b);
    }

    //Method Overloading with Type Promotion if matching found
    static void print(int a, int b) {
        System.out.println("int arg method invoked");
    }

    static void print(long a, long b) {
        System.out.println("long arg method invoked");
    }

    //Method Overloading with Type Promotion in case of ambiguity
    static void test(int a, long b) {
        System.out.println("a method invoked");
    }

    static void test(long a, int b) {
        System.out.println("b method invoked");
    }

    public static void main(String[] args) {
        System.out.println(add(11, 11));
        System.out.println(add(11, 11, 11));
        System.out.println(add(12.3, 12.6));

        sum(20, 20);//now second int literal will be promoted to long

        print(20, 20);//now int arg sum() method gets invoked

        //Method Overloading with Type Promotion in case of ambiguity
        //test(20,20);
    }
}
