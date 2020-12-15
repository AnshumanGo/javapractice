package com.practice.java._5controlstatements._5dowhilestatement;

public class _1DoWhileStatement {

    public static void main(String[] args) {

        // If the number of iteration is not fixed and you must have to execute the loop at least once,
        // it is recommended to use do-while loop.
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}
