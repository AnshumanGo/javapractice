package com.practice.java._6javaoops;

public class _2StaticKeyword {

    public static void main(String args[]){
        Student.change();

        Student s1 = new Student(1,"ramesh");
        Student s2 = new Student(2,"suresh");
        Student s3 = new Student(2,"rakesh");

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}

class Student{
    int rollno;
    String name;
    static String college = "ITGGU";

    static void change(){
        college = "ITGGVV";
    }

    Student(int r, String n){
        rollno = r;
        name = n;
    }

    void displayDetails(){System.out.println(rollno+" "+name+" "+college);}
}