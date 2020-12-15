package com.practice.java._9javaabstraction;

public class _1Abstraction {

    public static void main(String[] args) {

        ParentAbstractClassOne parentAbstractClassOne = new ChildAbstractClassThree();
        ChildAbstractClassThree childAbstractClassThree = (ChildAbstractClassThree) parentAbstractClassOne;
        parentAbstractClassOne.run();
        childAbstractClassThree.run();

        ChildAbstractClassThree childAbstractClassThree1 = new ChildAbstractClassThree();
        childAbstractClassThree1.run();
    }
}

abstract class ParentAbstractClassOne {

    ParentAbstractClassOne() {

        System.out.println("Parent Abstract Class One");
    }

    abstract void run();
}

/* Implement abstract method or declare class as abstract
class ChildAbstractClassOne extends ParentAbstractClassOne{

}*/

abstract class ChildAbstractClassTwo extends ParentAbstractClassOne {

}

class ChildAbstractClassThree extends ParentAbstractClassOne {

    void run() {

        System.out.println("Child Abstract Class Three");
    }
}

abstract class ParentAbstractClassTwo {

}

class ChildAbstractClassFour extends ParentAbstractClassTwo {

}

abstract class ChildAbstractClassFive extends ParentAbstractClassTwo {

}

/*Declare class as abstract if it contains abstract method
class ParentAbstractClassThree{

    abstract void print();
    }
}*/
