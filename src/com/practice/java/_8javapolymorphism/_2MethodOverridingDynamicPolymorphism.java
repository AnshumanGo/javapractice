package com.practice.java._8javapolymorphism;

public class _2MethodOverridingDynamicPolymorphism {

    void run(){System.out.println("_2MethodOverridingDynamicPolymorphism");}

    public static void main(String[] args) {

        _2MethodOverridingDynamicPolymorphism methodOverridingDynamicPolymorphism
                = new _2MethodOverridingDynamicPolymorphism();

        _2MethodOverridingDynamicPolymorphism methodOverridingDynamicPolymorphism1
                = new _2MethodOverridingDynamicPolymorphismChild();

        methodOverridingDynamicPolymorphism.run();
        methodOverridingDynamicPolymorphism1.run();
    }

}

class _2MethodOverridingDynamicPolymorphismChild extends  _2MethodOverridingDynamicPolymorphism{

    @Override
    void run() {
        System.out.println("_2MethodOverridingDynamicPolymorphismChild");
    }
}