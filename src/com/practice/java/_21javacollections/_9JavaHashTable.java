package com.practice.java._21javacollections;

import java.util.Hashtable;
import java.util.Map;

public class _9JavaHashTable {

    /*
    Java HashTable extends Dictionary<K,V> and implements Map<K,V>, Cloneable, java.io.Serializable
    Java Hashtable is an array of a list. Each list is known as a bucket. The position of the bucket is identified by calling the hashcode() method. A Hashtable contains values based on the key.
    Java Hashtable class contains unique elements.
    Java Hashtable class doesn't allow null key or value.
    Java Hashtable class is synchronized.
    Java Hashtable maintains descending order.
    The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
    */

    public static void main(String args[]){
        Hashtable<Integer,String> hashtable=new Hashtable<Integer,String>();

        hashtable.put(1,"Mango");
        hashtable.put(2,"Apple");
        hashtable.put(4,"Banana");
        hashtable.put(5,"Orange");
        hashtable.put(3,"Cherry");

        for(Map.Entry m:hashtable.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        hashtable.remove(3);
        System.out.println("After remove: "+ hashtable);

        //Here, we specify the if and else statement as arguments of the method
        System.out.println(hashtable.getOrDefault(8, "Not Found"));
        System.out.println(hashtable.getOrDefault(6, "Not Found"));

        hashtable.putIfAbsent(7,"Guava");
        System.out.println("Updated Map: "+hashtable);
        //Returns the current value, as the specified pair already exist
        hashtable.putIfAbsent(3,"Pineapple");
        System.out.println("Updated Map: "+hashtable);
    }


}
