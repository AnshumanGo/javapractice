package com.practice.java._3datatypes;

public class _9NumericDataTypeCasting {

    public static void main(String[] args) {

        Double doubleVal = Double.parseDouble("8");
        byte byteValue = doubleVal.byteValue();
        int intValue = doubleVal.intValue();
        long longValue = doubleVal.longValue();
        float floatValue = doubleVal.floatValue();

        double v = byteValue + intValue + longValue + floatValue + doubleVal;

        System.out.println(v);
    }
}
