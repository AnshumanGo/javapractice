package com.practice.java._8javapolymorphism;

public class _4SuperKeyword {

    public static void main(String[] args) {

        SuperParent superParent = new SuperChild();
        SuperChild superChild = (SuperChild) superParent;

        //Result be similar to both call as they referring to same object
        superParent.test();
        superChild.test();

        superChild.name = "child";

        superParent.test();
        superChild.test();

        /*SuperChild superChild1 = (SuperChild) new SuperParent();// It will give class cast exception
        superChild1.test();*/
    }

}


class SuperParent {

    String name = "SuperParent";

    SuperParent() {

        System.out.println("SuperParent Constructor");
    }

    void test() {
        System.out.println("SuperParent test");
    }
}

class SuperChild extends SuperParent {

    SuperChild() {

        super();
        //this(); //Can't call super() and this () at same time in same constructor
        System.out.println("SuperChild Constructor");
    }

    @Override
    void test() {
        System.out.println(this + "  " + super.name + " name");
        System.out.println(this + "  " + "SuperChild test");
    }
}