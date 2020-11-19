package com.practice.java._8javapolymorphism;

public class _6FinalVarAndMethod {

    public static void main(String[] args) {

        ParentFinalVarAndMethod parentFinalVarAndMethod
                = new ChildFinalVarAndMethod();
        //parentFinalVarAndMethod.strVal = "four";// Can't assign value to already initialized final non-static variable
        ChildFinalVarAndMethod childFinalVarAndMethod = (ChildFinalVarAndMethod) parentFinalVarAndMethod;
        //childFinalVarAndMethod.strVal = "five";// Can't assign value to already initialized final non-static variable

        ChildFinalVarAndMethod childFinalVarAndMethod1 = new ChildFinalVarAndMethod();
        //childFinalVarAndMethod1.strVal = "six";// Can't assign value to already initialized final non-static variable
    }
}

class ParentFinalVarAndMethod{

    static final int i =90;

    static {

        //i=10; // Can't assign value to already initialized final static variable
    }

    final String strVal = "one";

    {
        //strVal = "two"; // Can't assign value to already initialized final non-static variable
    }

    ParentFinalVarAndMethod(){

        //this.strVal="three";// Can't assign value to already initialized final non-static variable
    }

    ParentFinalVarAndMethod(int i){

        //this.strVal="three";// Can't assign value to already initialized final non-static variable
    }

    final char test(){

        return 'y';
    }
}

class ChildFinalVarAndMethod extends ParentFinalVarAndMethod {

    static {

        //i=10; // Can't assign value to already initialized final static variable
    }

    {
        //strVal = "two"; // Can't assign value to already initialized final non-static variable
    }

    ChildFinalVarAndMethod(){

        //this.strVal="three";// Can't assign value to already initialized final non-static variable
    }

    ChildFinalVarAndMethod(int i){

        //this.strVal="three";// Can't assign value to already initialized final non-static variable
    }

    //Can't override final method
    /*@Override
    final char test(){

        return 'y';
    }*/
}