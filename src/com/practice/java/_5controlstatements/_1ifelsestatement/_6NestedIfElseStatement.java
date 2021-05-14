package com.practice.java._5controlstatements._1ifelsestatement;

public class _6NestedIfElseStatement {

    public static void main(String[] args) {

        int physicsMarks=34, chemistryMarks=35, mathematicsMarks=36, englishMarks=35, hindiMarks=35;
        int avgMarks = (physicsMarks+chemistryMarks+mathematicsMarks+englishMarks+hindiMarks)/5;
        int pcmAvg=(physicsMarks+chemistryMarks+mathematicsMarks)/3;

        if (physicsMarks>=35 && chemistryMarks>=35 && mathematicsMarks>=35 && englishMarks>=35 && hindiMarks>=35 && avgMarks>=35) {
            if (pcmAvg >= 75) {
                System.out.println("You can apply for BITS");
            } else {
                System.out.println("You can not apply for BITS");
            }
        } else {
            System.out.println("You should pass 12th to apply for BITS");
        }
    }
}
