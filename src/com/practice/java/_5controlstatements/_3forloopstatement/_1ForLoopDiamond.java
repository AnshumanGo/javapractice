package com.practice.java._5controlstatements._3forloopstatement;

public class _1ForLoopDiamond {

    public static void main(String[] args) {

        //If the number of iteration is fixed, it is recommended to use for loop.
        int level=5;
        //Comment from line 10 to 21 to get up side down pyramid
        for(int i=1;i<=level;i++){
            for(int j=level-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=1;j <= i; j++){
                System.out.print("*");
            }
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println();//new line
        }

        //Comment from line 24 to 35 to get pyramid
        for(int i=1;i<=level-1;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j <= level-i; j++){
                System.out.print("*");
            }
            for(int j=1;j < level-i; j++){
                System.out.print("*");
            }
            if(i<=level-2)
                System.out.println();
        }
    }
}