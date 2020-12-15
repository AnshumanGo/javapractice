package com.practice.java._8javapolymorphism;

public class _2MethodOverridingDynamicPolymorphism {

    public static void main(String[] args) {

        _2MethodOverridingDynamicPolymorphism methodOverridingDynamicPolymorphism
                = new _2MethodOverridingDynamicPolymorphism();

        _2MethodOverridingDynamicPolymorphism methodOverridingDynamicPolymorphism1
                = new _2MethodOverridingDynamicPolymorphismChild();

        methodOverridingDynamicPolymorphism.run();//_2MethodOverridingDynamicPolymorphism should have run method or it will cause CTE
        methodOverridingDynamicPolymorphism1.run();//In case _2MethodOverridingDynamicPolymorphism is not having run method,
        //then either cast methodOverridingDynamicPolymorphism1 to _2MethodOverridingDynamicPolymorphismChild or
        //change reference to _2MethodOverridingDynamicPolymorphismChild so that it will call run method from _2MethodOverridingDynamicPolymorphismChild
    }

    void run() {
        System.out.println("_2MethodOverridingDynamicPolymorphism");
    }

}

class _2MethodOverridingDynamicPolymorphismChild extends _2MethodOverridingDynamicPolymorphism {

    @Override
//In case _2MethodOverridingDynamicPolymorphism is not having run method, comment @Override annotation
    void run() {
        System.out.println("_2MethodOverridingDynamicPolymorphismChild");
    }
}