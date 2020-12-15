package com.practice.java._5controlstatements._1ifelsestatement;

public class _1IfStatement {

    public static void main(String[] args) {

        boolean isStudying = true;
        //Checking whether isStudying is false or not and it fails as its value is true
        if (isStudying == false) {
            System.out.println("False 1 : " + isStudying);
            System.out.println("He is not studying");
        }
        //Assigning isStudying as false and skips the code block as value is false
        if (isStudying = false) {
            System.out.println("False 2 : " + isStudying);
            System.out.println("He is not studying");
        }
        //Checking isStudying is true or not and it fails as its value is changed to false
        if (isStudying == true) {
            System.out.println("True 1 : " + isStudying);
            System.out.println("He is studying");
        }
        //Assigning value of is Studying to True and passing if condition as it true condition
        if (isStudying = true) {
            System.out.println("True 2 : " + isStudying);
            System.out.println("He is studying");
        }
        //Checking isStudying is true or not and it pass as its value is changed to true
        if (isStudying == true) {
            System.out.println("True 3 : " + isStudying);
            System.out.println("He is studying");
        }
    }
}
