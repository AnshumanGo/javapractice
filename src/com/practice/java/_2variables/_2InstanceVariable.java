package com.practice.java._2variables;

public class  _2InstanceVariable {

    int i = 10;
    /*Instance variable will not be using static keyword.
    If static is used then it becomes static variable with class level scope with set same value for every object's state*/
    static String strValue="test";

    public static void main(String[] args) {

        _2InstanceVariable instanceVariableOne = new _2InstanceVariable();
        _2InstanceVariable instanceVariableTwo = new _2InstanceVariable();

        System.out.println("instance variable int i value for instanceVariableOne object :" + instanceVariableOne.i);
        System.out.println("instance variable int strValue value for instanceVariableOne object :" + instanceVariableOne.strValue);
        System.out.println("instance variable int i value for instanceVariableTwo object :" + instanceVariableTwo.i);
        System.out.println("instance variable int strValue value for instanceVariableTwo object :" + instanceVariableTwo.strValue);

        /*
        * Update i and strValue for instanceVariableOne and check current value of  i and strValue for instanceVariableOne
        * and instanceVariableTwo
        * */
        instanceVariableOne.i = 20;
        instanceVariableOne.strValue="testOne";

        System.out.println("instance variable int i value for instanceVariableOne object :" + instanceVariableOne.i);
        System.out.println("instance variable int strValue value for instanceVariableOne object :" + instanceVariableOne.strValue);
        System.out.println("instance variable int i value for instanceVariableTwo object :" + instanceVariableTwo.i);
        System.out.println("instance variable int strValue value for instanceVariableTwo object :" + instanceVariableTwo.strValue);

        /*
         * Update i and strValue for instanceVariableTwo and check current value of  i and strValue for instanceVariableOne
         * and instanceVariableTwo
         * */
        instanceVariableTwo.i = 30;
        instanceVariableTwo.strValue="testTwo";
        System.out.println("instance variable int i value for instanceVariableOne object :" + instanceVariableOne.i);
        System.out.println("instance variable int strValue value for instanceVariableOne object :" + instanceVariableOne.strValue);
        System.out.println("instance variable int i value for instanceVariableTwo object :" + instanceVariableTwo.i);
        System.out.println("instance variable int strValue value for instanceVariableTwo object :" + instanceVariableTwo.strValue);
    }
}
