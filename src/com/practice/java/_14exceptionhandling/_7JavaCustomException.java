package com.practice.java._14exceptionhandling;

public class _7JavaCustomException {

    public static void main(String args[])
    {
        try
        {
            // Throw an object of user defined exception
            throw new CustomException("User defined java custom exception");
        }
        catch (CustomException ex)
        {
            System.out.println("User defined java custom exception Caught");
            System.out.println(ex.getMessage());
        }
    }
}

class CustomException extends Exception
{
    public CustomException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}
