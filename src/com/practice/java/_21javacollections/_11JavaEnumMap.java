package com.practice.java._21javacollections;

import java.util.*;

public class _11JavaEnumMap {

    /*
    Java > extends AbstractMap<K, V> and implements java.io.Serializable, Cloneable
    */

    enum seasons {
        SUMMER, RAINY, WINTER
    }

    public static void main(String[] args) {
        //create and populate enum seasonsStringEnumMapOne
        EnumMap<seasons, String> seasonsStringEnumMapOne = new EnumMap<seasons, String>(seasons.class);
        seasonsStringEnumMapOne.put(seasons.SUMMER, "1");
        seasonsStringEnumMapOne.put(seasons.RAINY, "2");

        // print the seasonsStringEnumMapOne
        for(Map.Entry m:seasonsStringEnumMapOne.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        EnumMap<seasons, String> seasonsStringEnumMapTwo = new EnumMap<seasons, String>(seasons.class);
        seasonsStringEnumMapTwo.put(seasons.WINTER, "3");
        seasonsStringEnumMapTwo.putAll(seasonsStringEnumMapOne);
        System.out.println("Seasons :"+seasonsStringEnumMapTwo);

        Set<seasons> keySet = seasonsStringEnumMapTwo.keySet();
        System.out.println(keySet);
        Collection<String> valuesSet = seasonsStringEnumMapTwo.values();
        System.out.println(valuesSet);
    }
}