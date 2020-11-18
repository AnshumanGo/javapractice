package com.practice.java._7javainheritance;

public class _3Composition {

        public static void main(String args[]){
            Square s=new Square(new CalculationUtil());
            double result=s.area(5);
            System.out.println(result);
        }
}

/*
    Life time of composition is with parent calling object.
    Once parent calling object is destroyed child is destroyed.
*/
class Square {

    private final CalculationUtil calculation;

    Square(CalculationUtil calculation){

        this.calculation = new CalculationUtil();
    }

    double area(int radius) {
        return calculation.square(radius);
    }
}