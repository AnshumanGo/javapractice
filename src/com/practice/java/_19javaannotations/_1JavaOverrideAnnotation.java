package com.practice.java._19javaannotations;

public class _1JavaOverrideAnnotation extends _1JavaOverrideAnnotationParent {

    //@Override /// You can not override static method in java
    static void testOverride() {

    }

    void testNonStaticOverride() {

        System.out.println("child test non static override without override annotation");
    }

   /* @Override This method does not exist in parent class
    void testnonStaticOverride(){

        System.out.println("child test non static override without override annotation");
    }*/
}

class _1JavaOverrideAnnotationParent {

    static void testOverride() {

        System.out.println("Parent test override");
    }

    void testNonStaticOverride() {

        System.out.println("Parent test non static override");
    }
}