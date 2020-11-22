package com.practice.java._13javastring;

import java.util.Locale;

public class _2JavaStringMethods {

    public static void main(String[] args) {

        String strMethodValOne = "test now String methods and  val-one";
        String strMethodValTwo = "test now String methods and  val-two";
        String strMethodValThree = strMethodValTwo.intern();
        String strMethodValFour = new String("test now String methods and  val-two");
        String strMethodValFive = strMethodValFour.intern();

        System.out.println(strMethodValOne.charAt(2));//'r'
        System.out.println(strMethodValOne.length());//33
        System.out.println(String.format("Value %s",strMethodValOne));//"Value test now String methods, and  val-one"
        System.out.println(String.format(Locale.FRANCE,"Value %s",strMethodValOne));//"Value test now String methods, and  val-one"
        System.out.println(strMethodValOne.substring(0));//"test now String methods, and  valone"
        System.out.println(strMethodValOne.substring(0,4));//"test"
        System.out.println(strMethodValOne.contains("s "));//true
        System.out.println(String.join("-", strMethodValOne,"join"));//"test now String methods, and  val-one-join"
        System.out.println(strMethodValOne.equals(strMethodValTwo));//true
        System.out.println(strMethodValOne.isEmpty());//false
        System.out.println(new String().isEmpty());//true
        System.out.println(strMethodValOne.concat(strMethodValTwo));//"test now String methods and  val-onetest now String methods and  val-two"
        System.out.println(strMethodValOne.replace('-', ' '));//"test now String methods and  val one"
        System.out.println(strMethodValTwo.replace("and","&"));//test now String methods &  val-one"
        System.out.println(strMethodValOne.substring(1,9).equalsIgnoreCase(strMethodValTwo.substring(1,9)));//true
        for (String strVal : strMethodValOne.split("\\s"))
            System.out.println(strVal);
        for (String strVal : strMethodValOne.split("\\s",1))
            System.out.println(strVal);
        for (String strVal : strMethodValOne.split("\\s",2))
            System.out.println(strVal);
        for (String strVal : strMethodValOne.split("\\s",3))
            System.out.println(strVal);
        System.out.println(strMethodValTwo==strMethodValThree);
        System.out.println(strMethodValTwo==strMethodValFour);
        System.out.println(strMethodValTwo==strMethodValFive);
        System.out.println(strMethodValThree==strMethodValFour);
        System.out.println(strMethodValThree==strMethodValFive);
        System.out.println(strMethodValFour==strMethodValFive);
        System.out.println(strMethodValFive.indexOf('t'));
        System.out.println(strMethodValFive.indexOf('t', 1));
        System.out.println(strMethodValFive.toLowerCase());
        System.out.println(strMethodValFive.toUpperCase());
        System.out.println(("   Trim "+strMethodValFive.concat("  ")).trim());
        System.out.println(String.valueOf(1231));
    }
}