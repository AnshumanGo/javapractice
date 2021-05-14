package com.practice.java._7javainheritance;

public class _3Composition {

    public static void main(String[] args) {

        College college = new College();
        college.address="Address";

        College.Department department = college.new Department();
        System.out.println(department.getAddress());

    }
}

/*
    Life time of composition is with parent calling object.
    Once parent calling object is destroyed child is destroyed.
*/
class College {

    String address;

    class Department{

        String getAddress(){

            return College.this.address;
        }
    }
}
