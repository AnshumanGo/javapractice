package com.practice.java._9Abstraction;

public class _3FunctionalInterfaceAbstraction {

    public static void main(String[] args) {

        ParentFunctionalInterface.runParent();

        ChildFunctionalInterfaceOne.runChildOne();

        System.out.println("***************");

        ChildFunctionalInterfaceTwo childFunctionalInterfaceTwo
                = new ChildFunctionalInterfaceImplementation();
        childFunctionalInterfaceTwo.testParent();
        childFunctionalInterfaceTwo.printChildOne();
        childFunctionalInterfaceTwo.testChildOne();

        System.out.println("**************");

        ChildFunctionalInterfaceImplementation childFunctionalInterfaceImplementation
                = (ChildFunctionalInterfaceImplementation) childFunctionalInterfaceTwo;
        childFunctionalInterfaceImplementation.testParent();
        childFunctionalInterfaceImplementation.printChildOne();
        childFunctionalInterfaceImplementation.testChildOne();
    }
}

interface ParentFunctionalInterface{
    //Default and static method are not visible in extending interface
    default void testParent(){
        System.out.println("ParentFunctionalInterface testParent");
    }

    static void runParent(){
        System.out.println("ParentFunctionalInterface runParent");
    }
}

//FunctionalInterface can have any number of default, static methods but can contain only one abstract method.
// It can also declare methods of object class.
//Functional interface can only extend interface when it does not have any abstract method.
@FunctionalInterface
interface ChildFunctionalInterfaceOne extends ParentFunctionalInterface{

    void printChildOne();

    //Default and static method are not visible in extending interface
    default void testChildOne(){
        System.out.println("ChildFunctionalInterfaceOne testChildOne");
    }

    static void runChildOne(){
        System.out.println("ChildFunctionalInterfaceOne runChildOne");
    }
}

@FunctionalInterface
interface ChildFunctionalInterfaceTwo extends ChildFunctionalInterfaceOne{

    //Default and static method are not visible in extending interface
    //void callChildTwo();//Functional interface cant have more than one abstract method other that abstract object class method
}

//Class implementing interface need to implement default and abstract methods
class ChildFunctionalInterfaceImplementation implements ChildFunctionalInterfaceTwo{

    @Override
    public void testParent() {

        System.out.println("ChildFunctionalInterfaceImplementation testParent");
    }

    @Override
    public void printChildOne() {
        System.out.println("ChildFunctionalInterfaceImplementation printChildOne");
    }

    @Override
    public void testChildOne() {
        System.out.println("ChildFunctionalInterfaceImplementation testChildOne");
    }
}