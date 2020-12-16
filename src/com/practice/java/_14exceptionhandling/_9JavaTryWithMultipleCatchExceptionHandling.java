package com.practice.java._14exceptionhandling;

public class _9JavaTryWithMultipleCatchExceptionHandling {

    public static void main(String args[]){
        try{
            int array[] = new int[10];
            array[10] = 30/0;
        }
        catch(/*Exception |*/ ArithmeticException | ArrayIndexOutOfBoundsException e){ // in case when your are catching multiple exceptions, follow the rule of generalized to more specialized. It means that, if you are using super (general) class, don't use child (specialized) class.
            System.out.println(e.getMessage());
        }
    }
}
