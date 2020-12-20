package com.practice.java._21javacollections;

import java.util.ArrayDeque;
import java.util.Deque;

public class _17ArrayDeque {

    /*
    Java Deque extends Queue<E>
    Java ArrayDeque extends AbstractCollection<E> and implements Deque<E>, Cloneable, Serializable
    */

    public static void main(String[] args) {

        Deque<String> nameDeque=new ArrayDeque<String>();
        nameDeque.offer("Ram");
        nameDeque.offer("Karan");
        nameDeque.add("Shyam");
        nameDeque.offerFirst("Arjun");
        System.out.println("After offerFirst Traversal...");
        for(String s:nameDeque){
            System.out.println(s);
        }

        System.out.println("First inserted element : " + nameDeque.peek());

        System.out.println("First inserted element " + nameDeque.poll() + " removed");

        System.out.println("After after removal of first element inserted");
        for(String s:nameDeque){
            System.out.println(s);
        }

        System.out.println("Second inserted element " + nameDeque.pollFirst() + " removed");
        for(String s:nameDeque){
            System.out.println(s);
        }

        System.out.println("Last inserted element " + nameDeque.pollLast() + " removed");

        System.out.println("After pollLast() Traversal...");
        for(String s:nameDeque){
            System.out.println(s);
        }
    }
}
