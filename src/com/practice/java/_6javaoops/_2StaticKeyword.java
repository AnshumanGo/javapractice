package com.practice.java._6javaoops;

public class _2StaticKeyword {

    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(1, "ramesh");
        Student s2 = new Student(2, "suresh");
        Student s3 = new Student(2, "rakesh");

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}

class Student {
    static String college = "ITGGU";
    int rollno;
    String name;

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    static void change() {
        college = "ITGGVV";
    }

    void displayDetails() {
        System.out.println(rollno + " " + name + " " + college);
    }
}