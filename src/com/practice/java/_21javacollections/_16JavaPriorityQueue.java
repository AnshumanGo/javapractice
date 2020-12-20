package com.practice.java._21javacollections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class _16JavaPriorityQueue {

    /*

    */

    public static void main(String args[]){
        PriorityQueue<String> nameQueue=new PriorityQueue<String>();
        nameQueue.add("Ram");
        nameQueue.add("Karan");
        nameQueue.add("Shyam");
        nameQueue.add("Arjun");

        System.out.println("head :"+nameQueue.element());
        System.out.println("head :"+nameQueue.peek());

        System.out.println("Iterating the nameQueue elements :");
        Iterator nameQueueIteratorOne=nameQueue.iterator();
        while(nameQueueIteratorOne.hasNext()){
            System.out.println(nameQueueIteratorOne.next());
        }
        nameQueue.remove();
        nameQueue.poll();

        System.out.println("after removing two elements:");
        Iterator<String> nameQueueIteratorTwo=nameQueue.iterator();
        while(nameQueueIteratorTwo.hasNext()){
            System.out.println(nameQueueIteratorTwo.next());
        }
    }
}
