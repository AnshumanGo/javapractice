package com.practice.java._21javacollections;

import java.util.HashSet;
import java.util.Iterator;

public class _3JavaHashSet {

    /*
    HashSet stores the elements by using a mechanism called hashing.
    HashSet contains unique elements only.
    HashSet allows null value.
    HashSet class is non synchronized.
    HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
    HashSet is the best approach for search operations.
    The initial default capacity of HashSet is 16, and the load factor is 0.75.
    */

    public static void main(String[] args) {

        HashSet<String> set=new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Three");
        set.add("Five");
        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
