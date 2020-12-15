package com.practice.java._9javaabstraction;

interface ParentInterfaceAbstractionOne {

    void print();
}

public class _2InterfaceAbstraction {

    public static void main(String[] args) {

        ParentInterfaceAbstractionOne parentInterfaceAbstractionOne
                = new ChildInterfaceAbstractionTwo();
        parentInterfaceAbstractionOne.print();

        /*//ChildInterfaceAbstractionTwo is not of type ChildInterfaceAbstractionOne
        ChildInterfaceAbstractionOne childInterfaceAbstractionOne
                = (ChildInterfaceAbstractionOne) parentInterfaceAbstractionOne;
        childInterfaceAbstractionOne.print();*/

        /*//ChildInterfaceAbstractionTwo is not of type ChildInterfaceAbstractionOne
        ChildInterfaceAbstractionTwo childInterfaceAbstractionTwo
                = (ChildInterfaceAbstractionTwo) childInterfaceAbstractionOne;*/

        ChildInterfaceAbstractionTwo childInterfaceAbstractionTwo
                = (ChildInterfaceAbstractionTwo) parentInterfaceAbstractionOne;
        childInterfaceAbstractionTwo.print();

        ChildInterfaceAbstractionTwo childInterfaceAbstractionTwo2
                = new ChildInterfaceAbstractionTwo();
        childInterfaceAbstractionTwo2.print();
    }
}

/* Implement abstract method or declare class as abstract
class ChildInterfaceAbstractionOne implements  ParentInterfaceAbstractionOne{

}*/

abstract class ChildInterfaceAbstractionOne implements ParentInterfaceAbstractionOne {
    //public abstract void print();
}

class ChildInterfaceAbstractionTwo implements ParentInterfaceAbstractionOne {

    public void print() {

        System.out.println("Child Interface Abstraction Two print");
    }
}