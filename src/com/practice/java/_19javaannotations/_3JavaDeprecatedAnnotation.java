package com.practice.java._19javaannotations;

public class _3JavaDeprecatedAnnotation {

    void test() {
        System.out.println("test");
    }

    @Deprecated
    void testnow() {
        System.out.println("testnow");
    }
}

class TestAnnotation3 {
    public static void main(String[] args) {

        _3JavaDeprecatedAnnotation a = new _3JavaDeprecatedAnnotation();
        a.testnow(); // showing highlighted that this method is depricated
    }
}
