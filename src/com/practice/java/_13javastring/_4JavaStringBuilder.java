package com.practice.java._13javastring;

public class _4JavaStringBuilder {

    public static void main(String[] args) {

        //StringBuilder is Thread safe so less efficient as it will take more time
        StringBuilder sbldr = new StringBuilder("sbldr");
        System.out.println(sbldr);
    }
}
