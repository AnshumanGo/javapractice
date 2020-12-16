package com.practice.java._21javacollections;

import java.util.ArrayList;

public class _1JavaArrayList {

    /*
    Java ArrayList class can contain duplicate elements.
    Java ArrayList class maintains insertion order.
    Java ArrayList class is non synchronized.
    Java ArrayList allows random access because array works at the index basis.
    In ArrayList, manipulation is little bit slower than the LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.
*/
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        //Printing the arraylist object
        System.out.println(list);
    }
}
