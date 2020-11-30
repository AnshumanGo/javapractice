package com.practice.java._17javainnerclassandinterface;

/*  Rule :
    1) Static nested inner class can be accessed by outer class name.
    2) It can access static data members of outer class including private.
    3) It cannot access non-static data members and methods.

*   Compiler generated code for Java Static Nested inner class
    import java.io.PrintStream;
    static class TestOuter1$Inner {

    TestOuter1$Inner(){}
    void msg(){
    System.out.println((new StringBuilder()).append("data is ")
    .append(TestOuter1.data).toString());
    }
} */

public class _4JavaStaticNestedInnerClass {

    static int data=30;

    static class Inner{

        void msgOne(){

            System.out.println("data is "+data);
        }

        static void msgTwo(){

            System.out.println("data is "+data);
        }
    }

    public static void main(String args[]){

        _4JavaStaticNestedInnerClass.Inner obj=new _4JavaStaticNestedInnerClass.Inner();
        obj.msgOne();
        _4JavaStaticNestedInnerClass.Inner.msgTwo();
    }
}