package com.practice.java._6javaoops;

public class _1JavaClassObject {

    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public _1JavaClassObject() {
    }

    public _1JavaClassObject(int id) {
        this.id = id;
    }

    public static void main(String[] args) {

        _1JavaClassObject javaClassObjectOne = new _1JavaClassObject();
        //Object and Class Example: Initialization through reference
        javaClassObjectOne.id=1;
        System.out.println("Java class object one id : "+javaClassObjectOne.id);

        //Object and Class Example: Initialization through a constructor
        _1JavaClassObject javaClassObjectTwo = new _1JavaClassObject(2);
        System.out.println("Java class object two id : "+javaClassObjectTwo.id);

        _1JavaClassObject javaClassObjectThree = new _1JavaClassObject();
        //Object and Class Example: Initialization through method
        javaClassObjectThree.setId(3);
        System.out.println("Java class object three id : "+javaClassObjectThree.getId());

    }
}
