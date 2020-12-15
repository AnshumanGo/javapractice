package com.practice.java._15javamultithreading;

/*
 * These are some of the guidelines using which we can avoid most of the deadlock situations.
 * ***Avoid Nested Locks: This is the most common reason for deadlocks, avoid locking another resource if you already hold one.
 * It’s almost impossible to get deadlock situation if you are working with only one object lock.
 * For example, another implementation of run() method without nested lock and program runs successfully without deadlock situation.
 * ***Lock Only What is Required: You should acquire lock only on the resources you have to work on,
 * for example in above program I am locking the complete Object resource but if we are only interested in one of it’s fields,
 * then we should lock only that specific field not complete object.
 * ***Avoid waiting indefinitely: You can get deadlock if two threads are waiting for each other to finish indefinitely
 * using thread join. If your thread has to wait for another thread to finish, it’s always best to use join with maximum
 * time you want to wait for thread to finish.*/

public class _12JavaThreadDeadlock {
    public static void main(String[] args) {

        final String resourceOne = "resourceOne";
        final String resourceTwo = "resourceTwo";

        // t1 tries to lock resourceOne then resourceTwo
        Thread t1 = new Thread() {

            public void run() {

                synchronized (resourceOne) {

                    System.out.println("Thread 1: locked resource 1");

                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {

                    }

                    synchronized (resourceTwo) {
                        System.out.println("Thread 1: locked resource 2");
                    }
                }
            }
        };

        // t2 tries to lock resourceTwo then resourceOne
        Thread t2 = new Thread() {

            public void run() {

                synchronized (resourceTwo) {

                    System.out.println("Thread 2: locked resource 2");

                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {

                    }

                    synchronized (resourceOne) {

                        System.out.println("Thread 2: locked resource 1");
                    }
                }
            }
        };


        t1.start();
        t2.start();
    }
}