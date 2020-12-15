package com.practice.java._10javaencapsulation._2encapsulation;

public class _1GetterSetterEncapsulation {

    public static void main(String[] args) {

        GetterSetterTest getterSetterTest = new GetterSetterTest();
        getterSetterTest.setStrVal("getter setter test string");
        System.out.println(getterSetterTest.getStrVal());
    }
}

class GetterSetterTest {

    private String strVal;

    public String getStrVal() {
        return strVal;
    }

    public void setStrVal(String strVal) {
        this.strVal = strVal;
    }
}