package com.practice.java._5controlstatements._2switchstatement;

public class _4EnumSwitchStatement {

    public static void main(String[] args) {

        Subject subjectNow = Subject.English;

        switch (subjectNow) {

            case Hindi:
                System.out.println("Subject is Hindi");
                break;
            case English:
                System.out.println("Subject is English");
                break;
            case Mathematics:
                System.out.println("Subject is Mathematics");
                break;
            default:
                System.out.println("This subject is not listed");
        }
    }

    enum Subject {Hindi, English, Mathematics}
}