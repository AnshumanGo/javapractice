package com.practice.java._17javainnerclassandinterface;

/*  Rule :
    1) The nested interface must be referred by the outer interface or class. It can't be accessed directly.
    2) Nested interface must be public if it is declared inside the interface
    but it can have any access modifier if declared within the class.
    3) Nested interfaces are declared static implicitly.

*   Compiler code generated for Nested inner interface
    public static interface Details$Message {
        public abstract void msg();
    }


*/

public class _5JavaNestedInnerInterface implements Details.Message{

    public void msg(){

        System.out.println("Hello nested interface");
    }

    public static void main(String args[]){

        Details.Message message=new _5JavaNestedInnerInterface();//upcasting here
        message.msg();
    }
}

interface Details{

    void print();

    interface Message{

        void msg();
    }
}