package com.practice.java._14exceptionhandling;

import java.util.regex.Pattern;

public class _3JavaExplicitlyThrowException {

    static void validate(String name) throws Exception {
        if(name.contains("&"))
            throw new Exception("not valid");
        else
            System.out.println("welcome to vote");
    }
    public static void main(String args[]) throws Exception {
        validate("asdfsd&");
        System.out.println("rest of the code...");
    }
}
