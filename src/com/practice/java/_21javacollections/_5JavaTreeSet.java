package com.practice.java._21javacollections;

import java.util.Iterator;
import java.util.TreeSet;

public class _5JavaTreeSet {

    /*
    Java TreeSet  extends AbstractSet<E> and implements NavigableSet<E>, Cloneable, java.io.Serializable
    Java TreeSet class contains unique elements only like HashSet.
    Java TreeSet class access and retrieval times are quiet fast.
    Java TreeSet class doesn't allow null element.
    Java TreeSet class is non synchronized.
    Java TreeSet class maintains ascending order.
    */

    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Ram");
        treeSet.add("Shyam");
        treeSet.add("Ram");
        treeSet.add("Ghanshyam");

        Iterator<String> itr = treeSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Traversing element through Iterator in descending order");
        Iterator i = treeSet.descendingIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println("Reverse Set using descendingSet()");
        i = treeSet.descendingSet().iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println("Highest Value: " + treeSet.pollFirst());

        System.out.println("Lowest Value: " + treeSet.pollLast());

        System.out.println("Head Set: " + treeSet.headSet("C", true));

        System.out.println("SubSet: " + treeSet.subSet("A", false, "E", true));

        System.out.println("TailSet: " + treeSet.tailSet("C", false));
    }
}
