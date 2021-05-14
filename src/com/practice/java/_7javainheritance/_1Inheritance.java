package com.practice.java._7javainheritance;

public class _1Inheritance {

    public static void main(String[] args) {

        EngineeringStudent studentOne = new EngineeringStudent();
        studentOne.id = 1;
        studentOne.name = "engone";
        studentOne.engineeringSubject = "common engineering subject";

        System.out.println("id = " + studentOne.id + ", name = " + studentOne.name + ", engineeringSubject = " + studentOne.engineeringSubject);


        CsEngineeringStudent studentTwo = new CsEngineeringStudent();
        studentTwo.id = 2;
        studentTwo.name = "csone";
        studentTwo.csEngineeringSubject = "cs engineering subjects";

        //Details of CsEngineeringStudent object is shown using overriding toString method
        System.out.println(studentTwo);


        EcEngineeringStudent studentThree = new EcEngineeringStudent();
        studentThree.id = 3;
        studentThree.name = "econe";
        studentThree.ecEngineeringSubject = "ec engineering subjects";

        //Details of EcEngineeringStudent object is shown using overriding toString method
        System.out.println(studentThree);
    }
}

class Student {

    int id;
    String name;
}

class EngineeringStudent extends Student {

    String engineeringSubject;
}

class CsEngineeringStudent extends EngineeringStudent {

    String csEngineeringSubject;

    //overriding toString method in CsEngineeringStudent
    @Override
    public String toString() {
        return "id = " + id +
                ", name= " + name +
                ", engineeringSubject = " + engineeringSubject +
                ", csEngineeringSubject = " + csEngineeringSubject;
    }
}

class EcEngineeringStudent extends EngineeringStudent {

    String ecEngineeringSubject;

    //overriding toString method in EcEngineeringStudent
    @Override
    public String toString() {
        return "id = " + id +
                ", name= " + name +
                ", engineeringSubject = " + engineeringSubject +
                ", ecEngineeringSubject = " + ecEngineeringSubject;
    }
}