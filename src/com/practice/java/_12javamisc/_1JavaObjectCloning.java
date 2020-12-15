package com.practice.java._12javamisc;

public class _1JavaObjectCloning implements Cloneable {

    int rollNo;
    String name;

    _1JavaObjectCloning(int rollNo, String name) {

        this.rollNo = rollNo;
        this.name = name;
    }

    public static void main(String[] args) {

        try {
            _1JavaObjectCloning s1 = new _1JavaObjectCloning(1, "nameOne");

            _1JavaObjectCloning s2 = (_1JavaObjectCloning) s1.clone();

            System.out.println(s1.rollNo + " " + s1.name);
            System.out.println(s2.rollNo + " " + s2.name);
        } catch (CloneNotSupportedException exception) {
        }
    }

    public Object clone() throws CloneNotSupportedException {

        return super.clone();
    }
}
