package com.practice.java._5controlstatements._2switchstatement;

public class _6FallThroughSwitchStatement {

    public static void main(String[] args) {

        int code = 10;

        switch (code) {

            case 10:
                System.out.println(10);
            case 11:
                System.out.println(11);
            case 12:
                System.out.println(12);
            default:
                System.out.println("Code not found");
        }
    }
}