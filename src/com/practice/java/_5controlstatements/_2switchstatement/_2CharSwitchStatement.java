package com.practice.java._5controlstatements._2switchstatement;

public class _2CharSwitchStatement {

    public static void main(String[] args) {

        char charVal = 'b';
        switch (charVal) {

            case 'a':
                System.out.println("Ayodhya");
                break;
            case 'b':
                System.out.println("Badrinath");
                break;
            default:
                System.out.println("Some other place apart from Ayodhya and Badrinath");
        }
    }
}
