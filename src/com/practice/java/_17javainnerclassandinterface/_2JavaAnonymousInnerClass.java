package com.practice.java._17javainnerclassandinterface;

/*  Compiler generated code for Java anonymous inner class

    import java.io.PrintStream;
    static class _2JavaAnonymousInnerClass$1 extends Person
    {
       _2JavaAnonymousInnerClass$1(){}
       void eat()
        {
            System.out.println("nice fruits");
        }
    }
* */

public class _2JavaAnonymousInnerClass {

    public static void main(String args[]) {

        Person p = new Person() {

            void eat() {

                System.out.println("nice fruits");
            }
        };

        p.eat();
    }
}

abstract class Person {

    abstract void eat();
}