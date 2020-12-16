package com.practice.java._21javacollections;

import java.util.LinkedList;

public class JavaLinkedList {

    public static void main(String args[]){
        LinkedList<String> linkedList=new LinkedList<String>();
        System.out.println("List of Animals: "+linkedList);
        linkedList.add("Cow");
        linkedList.add("Cat");
        linkedList.add("Lion");
        System.out.println("After invoking add(E e) method: "+linkedList);
        //Adding an element at the specific position
        linkedList.add(1, "Tiger");
        System.out.println("After invoking add(int index, E element) method: "+linkedList);
        LinkedList<String> linkedListTwo=new LinkedList<String>();
        linkedListTwo.add("Dear");
        linkedListTwo.add("Bear");
        //Adding second list elements to the first list
        linkedList.addAll(linkedListTwo);
        System.out.println("After invoking addAll method: "+linkedList);
        LinkedList<String> linkedListThree=new LinkedList<String>();
        linkedListThree.add("Monkey");
        linkedListThree.add("Dog");
        //Adding second list elements to the first list at specific position
        linkedList.addAll(1, linkedListThree);
        System.out.println("After invoking addAll method: "+linkedList);
        //Adding an element at the first position
        linkedList.addFirst("Rat");
        System.out.println("After invoking addFirst(E e) method: "+linkedList);
        //Adding an element at the last position
        linkedList.addLast("Ox");
        System.out.println("After invoking addLast(E e) method: "+linkedList);


        //Removing element on the basis of specific position
        linkedList.remove(0);
        System.out.println("After invoking remove(index) method: "+linkedList);
        //Removing all the new elements from arraylist
        linkedList.removeAll(linkedListTwo);
        System.out.println("After invoking removeAll() method: "+linkedList);
        //Removing first element from the list
        linkedList.removeFirst();
        System.out.println("After invoking removeFirst() method: "+linkedList);
        //Removing first element from the list
        linkedList.removeLast();
        System.out.println("After invoking removeLast() method: "+linkedList);
        //Removing first occurrence of element from the list
        linkedList.removeFirstOccurrence("Rat");
        System.out.println("After invoking removeFirstOccurrence() method: "+linkedList);
        //Removing last occurrence of element from the list
        linkedList.removeLastOccurrence("Dog");
        System.out.println("After invoking removeLastOccurrence() method: "+linkedList);

        //Removing all the elements available in the list
        linkedList.clear();
        System.out.println("After invoking clear() method: "+linkedList);
    }
}
