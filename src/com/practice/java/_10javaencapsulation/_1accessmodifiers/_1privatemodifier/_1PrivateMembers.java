package com.practice.java._10javaencapsulation._1accessmodifiers._1privatemodifier;

public class _1PrivateMembers {

    public static void main(String[] args) {

        PrivateMember privateMember = new PrivateMember();

        //Private member are not visible outside class in which they are declared
        //privateMember.i;
        //privateMember.getIntValue();
        //PrivateMember privateMember1 = new PrivateMember(12);
    }
}

class PrivateMember {

    private int i = 10;

    PrivateMember() {

        System.out.println("PrivateMember no arg constructor");
    }

    private PrivateMember(int i) {
        this.i = i;
    }

    private int getIntValue() {

        return i;
    }
}