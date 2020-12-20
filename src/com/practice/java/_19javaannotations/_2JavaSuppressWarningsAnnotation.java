package com.practice.java._19javaannotations;

import java.util.ArrayList;

public class _2JavaSuppressWarningsAnnotation {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("ram");
        list.add("shyam");
        list.add("baldao");

        for (Object obj : list) {
            System.out.println(obj);
        }

    }
}
