package com.practice.java._8javapolymorphism;

public class _3CovariantReturnType {

    public static void main(String[] args) {

        ParentCovariant covariant = new ChildCovariant();
        covariant.get().print();
    }
}

class ParentCovariant {

    ParentCovariant get() {

        return this;
    }

    void print() {

        System.out.println("From ParentCovariant");
    }
}

class ChildCovariant extends ParentCovariant {

    @Override
    ChildCovariant get() {

        return this;
    }

    void print() {

        System.out.println("From ChildCovariant");
    }
}