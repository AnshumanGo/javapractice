package com.practice.java._13javastring;

public class _1JavaString {

    public static void main(String[] args) {

        String strLiteralValueOne = "str literal value";
        String strLiteralValueTwo = "str literal value";
        String strNewValueOne = "String New Value";
        String strNewValueTwo = "String New Value";

        //Use System.identityHashCode to get proper hashcode in case of String variable created as new String()
        System.out.println("Literal strLiteralValueOne (+" + System.identityHashCode(strLiteralValueOne) + ") : " + strLiteralValueOne);
        System.out.println("Literal strLiteralValueTwo (+" + System.identityHashCode(strLiteralValueTwo) + ") : " + strLiteralValueTwo);
        System.out.println("New Keyword (+" + System.identityHashCode(strNewValueOne) + ") : " + strNewValueOne);
        System.out.println("New Keyword (+" + System.identityHashCode(strNewValueTwo) + ") : " + strNewValueTwo);
    }


}
