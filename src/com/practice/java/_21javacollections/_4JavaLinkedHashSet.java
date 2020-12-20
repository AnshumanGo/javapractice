package com.practice.java._21javacollections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class _4JavaLinkedHashSet {

    /*
    Java LinkedHashSet extends HashSet<E> and implements Set<E>, Cloneable, java.io.Serializable
    Java LinkedHashSet class contains unique elements only like HashSet.
    Java LinkedHashSet class provides all optional set operation and permits null elements.
    Java LinkedHashSet class is non synchronized.
    Java LinkedHashSet class maintains insertion order.
    */

    public static void main(String args[]){
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<String>();
        linkedHashSet.add("apple");
        linkedHashSet.add("orange");
        linkedHashSet.add("apple");
        linkedHashSet.add("mango");
        Iterator<String> itr=linkedHashSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
