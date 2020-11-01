package com.practice.java._2variables;

public class _1LocalVariable {

    void localVar(){

        //static int j=2; local variable cant be declared with static
        int i=10;
        System.out.println("Value of local integer variable i : "+i);
    }

    public static void main(String[] args) {

        _1LocalVariable localVariable = new _1LocalVariable();
        localVariable.localVar();
        //localVariable.i; local scope is within method only
    }
}
