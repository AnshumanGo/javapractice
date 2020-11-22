package com.practice.java._13javastring;

public class _3JavaStringBuffer {

    public static void main(String[] args) {

        //StringBuffer is Thread safe so less efficient as it will take more time
        StringBuffer sb= new StringBuffer("Sb");
        System.out.println(sb);
    }
}
