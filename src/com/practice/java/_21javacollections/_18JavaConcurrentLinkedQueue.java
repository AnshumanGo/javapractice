package com.practice.java._21javacollections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class _18JavaConcurrentLinkedQueue {

    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<String>()
                ;
        List<String> list = new ArrayList<String>();
        queue.add("Ghanshyam");
        queue.add("Ram");
        queue.add("Karan");
        queue.add("Shyam");
        queue.add("Arjun");
        queue.add("Ravi");

        list.add("Ghanshyam");
        list.add("Shyam");

        System.out.println("Elements in queue : "+queue);
        //remove() method will remove the specified element from the queue

        queue.remove("Ravi");
        queue.remove("Ram");

        System.out.println("Remaining elements in queue : "+queue);
        //Removes all the elements of this in queue which are present in the list
        queue.removeAll(list);
        System.out.println("Elements of the list will get removed : "+queue);
        //Retain only those elements in this queue that are present in the list
        queue.retainAll(list);
        System.out.println("Queue will retain the elements of the list: "+queue);
    }
}
