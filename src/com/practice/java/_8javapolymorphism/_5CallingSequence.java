package com.practice.java._8javapolymorphism;

public class _5CallingSequence {

    public static void main(String[] args) {

        ParentCall parentCall = new ChildCall();
        System.out.println(parentCall.parentCallMethod());

        ChildCall childCall = (ChildCall) parentCall;
        System.out.println(childCall.parentCallMethod());
        System.out.println(childCall.childCallMethodTwo());
        System.out.println(childCall.parentCallMethodTwo());

        ParentCall.parentCallMethodOne();
        ChildCall.childCallMethodOne();
    }
}

class ParentCall {

    static {

        System.out.println("SIB2 Parent call");
    }

    static {
        System.out.println("SIB3 Parent call");
    }

    static {
        System.out.println("SIB1 Parent call");
    }

    {
        System.out.println("IIB2 Parent call");
    }

    {
        System.out.println("IIB3 Parent call");
    }

    {
        System.out.println("IIB4 Parent call");
    }

    {
        System.out.println("IIB1 Parent call");
    }

    ParentCall() {

        System.out.println("Default Constructor Parent Call");
    }

    ParentCall(int i) {

        System.out.println("Parameterized Constructor Parent call with i : " + i);
    }

    static void parentCallMethodOne() {

        System.out.println("Parent Call Method One");
    }

    String parentCallMethodTwo() {

        return "Parent Call Method Two";
    }

    int parentCallMethod() {

        return 22;
    }
}

class ChildCall extends ParentCall {

    static {
        System.out.println("SIB2 Child call");
    }

    static {
        System.out.println("SIB3 Child call");
    }

    static {

        System.out.println("SIB1 Child call");
    }

    {
        System.out.println("IIB2 Child call");
    }

    {
        System.out.println("IIB3 Child call");
    }

    {
        System.out.println("IIB4 Child call");
    }

    {
        System.out.println("IIB1 Child call");
    }

    ChildCall() {
        super(66);
        //this(88); // Only super or this constructor call is allowed in single constructor
        System.out.println("Default Constructor Child Call");
    }

    ChildCall(int i) {
        super();
        System.out.println("Parameterized Constructor Child call with i : " + i);
    }

    static void childCallMethodOne() {

        System.out.println("Child Call Method One");
    }

    String childCallMethodTwo() {

        return "Child Call Method Two";
    }

    @Override
    int parentCallMethod() {

        return 44;
    }
}