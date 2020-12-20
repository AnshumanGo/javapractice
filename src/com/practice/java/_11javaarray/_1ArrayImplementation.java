package com.practice.java._11javaarray;

public class _1ArrayImplementation {

    public static void main(String[] args) {

        int[] array = new int[5];
        array[0] = 10;
        array[1] = 20;
        array[2] = 50;
        array[3] = 30;
        array[4] = 90;

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
        }

        char[] charArray = {'c', 'e', 'r', 'g'};
        for (int i = 0; i < charArray.length; i++) {

            System.out.println(charArray[i]);
        }
        String s = new String(charArray);

        System.out.println(s);
    }
}
