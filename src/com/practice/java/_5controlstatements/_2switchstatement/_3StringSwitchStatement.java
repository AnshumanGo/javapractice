package com.practice.java._5controlstatements._2switchstatement;

public class _3StringSwitchStatement {

    public static void main(String[] args) {

        String classStndard = "eigth";

        switch (classStndard) {

            case "fifth":
            case "eighth":
            case "tenth":
            case "twelfth":
                System.out.println("Board class");
                break;
            default:
                System.out.println("Not board class");
        }
    }
}