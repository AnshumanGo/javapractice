package com.practice.java._2variables;

public class _3StaticVariable {

    //When you need something that will be used through out the application and every instance need to know the variable.
    static String strVar="test";

    void printStaticVariableValue(){

        System.out.println("From non static method : Static variable strVar value is "+strVar);
    }

    public static void main(String[] args) {

        _3StaticVariable staticVariableOne = new _3StaticVariable();

        System.out.println("Static variable strVar value is "+strVar);

        staticVariableOne.printStaticVariableValue();
    }

}
