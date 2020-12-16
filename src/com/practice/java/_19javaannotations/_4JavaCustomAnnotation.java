package com.practice.java._19javaannotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class _4JavaCustomAnnotation {

    @MyAnnotation(value=10)
    public void sayHello(){System.out.println("hello annotation");}

    public static void main(String args[])throws Exception{

        _4JavaCustomAnnotation h=new _4JavaCustomAnnotation();
        Method m=h.getClass().getMethod("sayHello");

        MyAnnotation manno=m.getAnnotation(MyAnnotation.class);
        System.out.println("value is: "+manno.value());
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation{
    int value();
}