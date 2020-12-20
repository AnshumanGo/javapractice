package com.practice.java._21javacollections;

import java.util.concurrent.ConcurrentHashMap;

public class _19JavaConcurrentHashMap {

    public static void main(String[] args)
    {
        // crete a HashMap and add some values
        ConcurrentHashMap<String, Integer> seasonConcurrentHashMap
                = new ConcurrentHashMap<>();
        seasonConcurrentHashMap.put("Summer", 100);
        seasonConcurrentHashMap.put("Rainy", 200);
        seasonConcurrentHashMap.put("Winter", 300);
        System.out.println("HashMap values :\n " + seasonConcurrentHashMap.toString());
        seasonConcurrentHashMap.computeIfAbsent("Autumn", k -> 200 + 300);
        seasonConcurrentHashMap.computeIfAbsent("Spring", k -> 60 * 10);
        System.out.println("New HashMap after computeIfAbsent :\n "+ seasonConcurrentHashMap);

        System.out.println("is 255  present? : "
                + seasonConcurrentHashMap.containsValue(700));
    }
}
