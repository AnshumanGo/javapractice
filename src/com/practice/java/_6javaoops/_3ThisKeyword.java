package com.practice.java._6javaoops;

public class _3ThisKeyword {

    private int id;

    void setId(_3ThisKeyword thisKeyword){

        //this used to refer current class instance variable
        this.id = thisKeyword.id;
    }

    _3ThisKeyword(){
    }


    _3ThisKeyword(_3ThisKeyword thisKeyword){

        //this used to refer current class no arg constructor
        this();
        //this used to refer current class instance method
        this.setId(thisKeyword);
    }

    //this is used as argument to method
    void displayDetails(_3ThisKeyword thisKeyword){

        System.out.println(thisKeyword.id);
    }

    //this is used to return current class instance
    _3ThisKeyword getThisKeywordObject(){

        return this;
    }

    public static void main(String[] args) {

        _3ThisKeyword thisKeywordOne = new _3ThisKeyword();
        thisKeywordOne.id = 1;

        //this used as argument in the constructor call.
        _3ThisKeyword thisKeywordTwo = new _3ThisKeyword(thisKeywordOne.getThisKeywordObject());
        thisKeywordTwo.displayDetails(thisKeywordTwo);
    }
}
