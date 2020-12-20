package com.practice.java._21javacollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class _1JavaArrayList {

    /*
    Java ArrayList extends AbstractList<E> and implements List<E>, RandomAccess, Cloneable, java.io.Serializable
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

        System.out.println("Iterator traversal");
        //Traversing list through Iterator
        Iterator itr=list.iterator();//getting the Iterator
        while(itr.hasNext()){//check if iterator has the elements
            System.out.println(itr.next());//printing the element and move to next
        }
        System.out.println("updating first element of list");
        list.set(1,"Orange");
        System.out.println("for each traversal");
        for ( String fruit: list) {
            System.out.println(fruit);
        }

        System.out.println("list sort ascending");
        Collections.sort(list);
        System.out.println("for loop traversal");
        for(int i=0;i<list.size();i++){

            System.out.println(list.get(i));
        }

        System.out.println("Traversal through forEach() method:");
        //The forEach() method is a new feature, introduced in Java 8.
        list.forEach(a->{ //Here, we are using lambda expression
            System.out.println(a);
        });

        System.out.println("Traversal through forEachRemaining() method");
        Iterator<String> forEachRemainingItr=list.iterator();
        forEachRemainingItr.forEachRemaining(a-> //Here, we are using lambda expression
        {
            System.out.println(a);
        });
    }
}
