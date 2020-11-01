package com.practice.java._2variables;

public class _2InstanceVariable {

    int i=10;
    //static String strValue="test"; Instance variable will not be using static keyword. If static is used then it
    // becomes static variable with class level scope

    public static void main(String[] args) {

        _2InstanceVariable instanceVariableOne = new _2InstanceVariable();
        _2InstanceVariable instanceVariableTwo = new _2InstanceVariable();

        System.out.println("instance variable int i value for instanceVariableOne object :"+instanceVariableOne.i);
        System.out.println("instance variable int i value for instanceVariableTwo object :"+instanceVariableTwo.i);

        instanceVariableOne.i=20;

        System.out.println("instance variable int i value for instanceVariableOne object :"+instanceVariableOne.i);
        System.out.println("instance variable int i value for instanceVariableTwo object :"+instanceVariableTwo.i);

        instanceVariableTwo.i=30;
        System.out.println("instance variable int i value for instanceVariableOne object :"+instanceVariableOne.i);
        System.out.println("instance variable int i value for instanceVariableTwo object :"+instanceVariableTwo.i);
    }
}
