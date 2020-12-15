package com.practice.java._5controlstatements._1ifelsestatement;

public class _6NestedIfElseStatement {

    public static void main(String[] args) {

        //Creating two variables for age and weight
        boolean istwelfthPassed = true;
        int pcmAvg = 75;
        //applying condition on age and weight
        if (istwelfthPassed == true) {
            if (pcmAvg > 75) {
                System.out.println("You can apply for BITS");
            } else {
                System.out.println("You can not apply for BITS");
            }
        } else {
            System.out.println("You should pass 12th to apply for BITS");
        }
    }
}
