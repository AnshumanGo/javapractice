package com.practice.java._21javacollections;

import java.util.Map;
import java.util.TreeMap;

public class _8JavaTreeMap {

    /*
    Java TreeMap extends AbstractMap<K,V> and implements NavigableMap<K,V>, Cloneable, java.io.Serializable
    Java TreeMap contains values based on the key.
    Java TreeMap contains only unique elements.
    Java TreeMap cannot have a null key but can have multiple null values.
    Java TreeMap is non synchronized.
    Java TreeMap maintains ascending order.
    */

    public static void main(String args[]){
        TreeMap<Integer,String> treeMap=new TreeMap<Integer,String>();
        treeMap.put(1,"Mango");
        treeMap.put(2,"Apple");
        treeMap.put(4,"Banana");
        treeMap.put(3,"Orange");

        for(Map.Entry m:treeMap.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        treeMap.remove(3);
        System.out.println("After invoking remove() method");
        for(Map.Entry m:treeMap.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }

        //Maintains descending order
        System.out.println("descendingMap : "+treeMap.descendingMap());
        //Returns key-value pairs whose keys are less than or equal to the specified key.
        System.out.println("headMap : "+treeMap.headMap(2,true));
        //Returns key-value pairs whose keys are greater than or equal to the specified key.
        System.out.println("tailMap : "+treeMap.tailMap(2,true));
        //Returns key-value pairs exists in between the specified key.
        System.out.println("subMap : "+treeMap.subMap(1, false, 2, true));
        //Returns key-value pairs exists in between the specified key.
        System.out.println("subMap : "+treeMap.subMap(1, 2));
        //It returns the key-value pair having the least key, greater than or equal to the specified key, or null if there is no such key.
        System.out.println("ceilingEntry :"+treeMap.ceilingEntry(3));
        //It returns the least key, greater than the specified key or null if there is no such key.
        System.out.println("ceilingKey : "+treeMap.ceilingKey(3));
        //It returns the key-value pairs whose keys are strictly less than toKey.
        System.out.println("headMap : "+treeMap.headMap(3));
        //It returns the least key strictly greater than the given key, or null if there is no such key.
        System.out.println("higherEntry : "+treeMap.higherEntry(3));
        //It returns a key-value mapping associated with the greatest key strictly less than the given key, or null if there is no such key.
        System.out.println("lowerKey : "+treeMap.lowerKey(3));
        //It returns the key-value pair having the greatest key, or null if there is no such key
        System.out.println("lastEntry : "+treeMap.lastEntry());
        //It is used to return the last (highest) key currently in the sorted map.
        System.out.println("lastKey : "+treeMap.lastKey());
        //It removes and returns a key-value mapping associated with the least key in this map, or null if the map is empty.
        System.out.println("pollFirstEntry : "+treeMap.pollFirstEntry());
        //It removes and returns a key-value mapping associated with the greatest key in this map, or null if the map is empty.
        System.out.println("pollLastEntry : "+treeMap.pollLastEntry());
    }
}
