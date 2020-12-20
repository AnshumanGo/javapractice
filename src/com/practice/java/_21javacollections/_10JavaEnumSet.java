package com.practice.java._21javacollections;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class _10JavaEnumSet {

    /*
    Java EnumSet<E extends Enum<E>> extends AbstractSet<E> and implements Cloneable, java.io.Serializable
    */

    enum seasons {
        SUMMER, RAINY, WINTER
    }

    public static void main(String[] args) {

        Set<seasons> seasonsEnumSetOne = EnumSet.of(seasons.SUMMER, seasons.WINTER);
        // Traversing elements
        Iterator<seasons> seasonsIterator = seasonsEnumSetOne.iterator();
        while (seasonsIterator.hasNext())
            System.out.println(seasonsIterator.next());

        Set<seasons> seasonsEnumSetTwo = EnumSet.allOf(seasons.class);
        System.out.println("Seasons :"+seasonsEnumSetTwo);
        Set<seasons> seasonsEnumSetThree = EnumSet.noneOf(seasons.class);
        System.out.println("Seasons:"+seasonsEnumSetThree);
    }
}
