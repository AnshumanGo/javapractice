package com.practice.java._17javainnerclassandinterface;

/*  Rules for Java Local Inner class
1) Local inner class cannot be invoked from outside the method.
2) Local inner class cannot access non-final local variable till JDK 1.7.
Since JDK 1.8, it is possible to access the non-final local variable
in local inner class.
3) Local variable can't be private, public or protected.

 *  Compiler generated code for Java local inner class
    import java.io.PrintStream;
    class _3JavaLocalInnerClass {

        final _3JavaLocalInnerClass this$0;
        _3JavaLocalInnerClass$Local(){

            super();
            this$0 = Simple.this;
        }

        void msg(){

            System.out.println(localInner1.access$000(localInner1.this));
        }
    }  */

public class _3JavaLocalInnerClass {

    private int data = 30;//instance variable

    public static void main(String args[]) {

        _3JavaLocalInnerClass javaLocalInnerClass = new _3JavaLocalInnerClass();
        javaLocalInnerClass.display();
    }

    void display() {

        class Local {

            void msg() {

                System.out.println(data);
            }
        }
        Local l = new Local();
        l.msg();
    }
}