package com.practice.java._21javacollections;

import java.util.HashMap;
import java.util.Map;

public class _6JavaHashMap {

    /*
    Java HashMap  extends AbstractMap<K,V> and implements Map<K,V>, Cloneable, Serializable
    Java HashMap contains values based on the key.
    Java HashMap contains only unique keys.
    Java HashMap may have one null key and multiple null values.
    Java HashMap is non synchronized.
    Java HashMap maintains no order.
    The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
    It denoted as HashMap<K,V>, where K stands for key and V for value.
    It inherits the AbstractMap class and implements the Map interface.
    */
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();//Creating HashMap
        map.put(1, "Cat"); //Put elements in Map
        map.put(2, "Cow");
        map.put(4, "Lion");
        map.put(3, "Dog");

        System.out.println("Hashmap iteration");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
