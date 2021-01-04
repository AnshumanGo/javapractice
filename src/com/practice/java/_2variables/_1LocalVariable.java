package com.practice.java._2variables;

public class _1LocalVariable {

    public static void main(String[] args) {

        _1LocalVariable localVariable = new _1LocalVariable();
        localVariable.localVar();
        /*local scope is within method only.
        If used it will give compile time error as cannot find symbol*/
        //System.out.println(localVariable.i);
    }

    void localVar() {

        /*local variable cant be declared with static .
        If done it will throw compile time error as illegal start of expression*/
        //static int j=2;
        int i = 10;
        System.out.println("Value of local integer variable i : " + i);
    }
}
