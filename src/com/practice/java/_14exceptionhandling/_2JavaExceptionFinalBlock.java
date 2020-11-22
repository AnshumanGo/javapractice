package com.practice.java._14exceptionhandling;

public class _2JavaExceptionFinalBlock {

    public static void main(String[] args) {

        try{
            int a[]=new int[5];

            System.out.println(a[10]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        finally {
            System.out.println("Finally block always execute and can be defined only ones");
        }/*
        finally {
            System.out.println("Finally block always execute and can be defined only ones");
        }*/
        System.out.println("rest of the code");
    }
}
