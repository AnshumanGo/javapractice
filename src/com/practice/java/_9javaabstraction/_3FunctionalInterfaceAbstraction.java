package com.practice.java._9javaabstraction;

interface ParentFunctionalInterface {
    static void runParent() {
        System.out.println("ParentFunctionalInterface runParent");
    }

    //Default and static method are not visible in extending interface and static methods are not visible to implementing class
    default void testParent() {
        System.out.println("ParentFunctionalInterface testParent");
    }
}

//FunctionalInterface can have any number of default, static methods but can contain only one abstract method.
// It can also declare methods of object class.
//Functional interface can only extend interface when it does not have any abstract method.
@FunctionalInterface
interface ChildFunctionalInterfaceOne extends ParentFunctionalInterface {

    static void runParent() {
        System.out.println("ChildFunctionalInterfaceOne runChildOne");
    }

    void printChildOne();

    //Default and static method are not visible in extending interface and static methods are not visible to implementing class
    default void testParent() {
        System.out.println("ChildFunctionalInterfaceOne testChildOne");
    }
}

@FunctionalInterface
interface ChildFunctionalInterfaceTwo extends ChildFunctionalInterfaceOne {

    static void runParent() {
        System.out.println("ChildFunctionalInterfaceTwo runChildOne");
    }

    //Default and static method are not visible in extending interface
    //void callChildTwo();//Functional interface cant have more than one abstract method other that abstract object class method
    default void testParent() {
        System.out.println("ChildFunctionalInterfaceTwo testChildOne");
    }
}

public class _3FunctionalInterfaceAbstraction {

    public static void main(String[] args) {

        ParentFunctionalInterface.runParent();

        ChildFunctionalInterfaceOne.runParent();

        ChildFunctionalInterfaceTwo.runParent();

        System.out.println("***************");

        ChildFunctionalInterfaceTwo childFunctionalInterfaceTwo
                = new ChildFunctionalInterfaceImplementationOne();
        childFunctionalInterfaceTwo.printChildOne();
        childFunctionalInterfaceTwo.testParent();

        System.out.println("**************");

        ChildFunctionalInterfaceImplementationOne childFunctionalInterfaceImplementationOne
                = (ChildFunctionalInterfaceImplementationOne) childFunctionalInterfaceTwo;
        childFunctionalInterfaceImplementationOne.printChildOne();
        childFunctionalInterfaceImplementationOne.testParent();

        System.out.println("***************");

        ChildFunctionalInterfaceOne childFunctionalInterfaceOne
                = new ChildFunctionalInterfaceImplementationTwo();
        childFunctionalInterfaceOne.printChildOne();
        childFunctionalInterfaceOne.testParent();

        System.out.println("**************");

        ChildFunctionalInterfaceImplementationTwo childFunctionalInterfaceImplementationTwo
                = (ChildFunctionalInterfaceImplementationTwo) childFunctionalInterfaceOne;
        childFunctionalInterfaceImplementationTwo.printChildOne();
        childFunctionalInterfaceImplementationTwo.testParent();
    }
}

//Class implementing interface need to implement default and abstract methods
class ChildFunctionalInterfaceImplementationOne implements ChildFunctionalInterfaceTwo {

    /*@Override
    public void testParent() {

        System.out.println("ChildFunctionalInterfaceImplementationOne testParent");
    }*/

    @Override
    public void printChildOne() {
        System.out.println("ChildFunctionalInterfaceImplementationOne printChildOne");
    }
/*
    @Override
    public void testChildOne() {
        System.out.println("ChildFunctionalInterfaceImplementationOne testChildOne");
    }*/
}

//Class implementing interface need to implement default and abstract methods
class ChildFunctionalInterfaceImplementationTwo implements ChildFunctionalInterfaceOne {

    /*@Override
    public void testParent() {

        System.out.println("ChildFunctionalInterfaceImplementationTwo testParent");
    }*/

    @Override
    public void printChildOne() {
        System.out.println("ChildFunctionalInterfaceImplementationTwo printChildOne");
    }
/*
    @Override
    public void testChildOne() {
        System.out.println("ChildFunctionalInterfaceImplementationTwo testChildOne");
    }*/
}