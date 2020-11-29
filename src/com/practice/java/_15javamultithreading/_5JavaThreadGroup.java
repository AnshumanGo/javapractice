package com.practice.java._15javamultithreading;

import java.nio.channels.Selector;

public class _5JavaThreadGroup implements Runnable{

    public void run() {

        System.out.println(Thread.currentThread().getName());
        try
        {
            Thread.sleep(10);
        }
        catch (InterruptedException ex)
        {
            System.out.println(Thread.currentThread().getName() + " interrupted");
        }
    }

    public static void main(String[] args) throws InterruptedException, SecurityException {

        _5JavaThreadGroup javaThreadGroup = new _5JavaThreadGroup();

        //a convenient way to group multiple threads in a single object.
        // In such way, we can suspend, resume or interrupt group of threads by a single method call.
        //Now suspend(), resume() and stop() methods are deprecated.
        ThreadGroup threadGroupOne = new ThreadGroup("Parent ThreadGroup One");
        ThreadGroup childThreadGroupOne = new ThreadGroup(threadGroupOne, "Child Thread Group One");
        ThreadGroup childThreadGroupTwo = new ThreadGroup(threadGroupOne, "Child Thread Group Two");

        Thread threadOne = new Thread(threadGroupOne, javaThreadGroup," Thread One ");
        Thread threadTwo = new Thread(childThreadGroupOne, javaThreadGroup," Thread Two ");
        Thread threadThree = new Thread(childThreadGroupTwo, javaThreadGroup," Thread Three ");

        // checking the number of active thread
        System.out.println("Number of active thread: "+ threadGroupOne.activeCount());

        threadOne.start();
        threadTwo.start();
        threadThree.start();

        System.out.println("Thread Group Name: "+threadGroupOne.getName());
        threadGroupOne.list();

        // Check for access permission of current running thread
        threadGroupOne.checkAccess();
        System.out.println(threadGroupOne.getName() + " has access");

        // checking the number of active thread
        System.out.println("Number of active thread: "+ threadGroupOne.activeCount());

        // checking the number of active thread group
        System.out.println("Number of active thread group: "
                + threadGroupOne.activeGroupCount());


        // destroying child threadGroup
        if(!childThreadGroupOne.isDestroyed()) {

            try {

                childThreadGroupOne.destroy();
                System.out.println(childThreadGroupOne.getName() + " destroyed");
            }catch ( IllegalThreadStateException e){

                System.out.println(childThreadGroupOne.getName() + " destroyed");
            }
        }


        // destroying child threadGroup
        if(!childThreadGroupTwo.isDestroyed()) {

            try {

                childThreadGroupTwo.destroy();
                System.out.println(childThreadGroupTwo.getName() + " destroyed");
            }catch ( IllegalThreadStateException e){

                System.out.println(childThreadGroupTwo.getName() + " destroyed");
            }
        }



        // destroying parent threadGroup
        if(!threadGroupOne.isDestroyed()) {

            try {

                threadGroupOne.destroy();
                System.out.println(threadGroupOne.getName() + " destroyed");
            }catch ( IllegalThreadStateException e){

                System.out.println(threadGroupOne.getName() + " destroyed");
            }
        }

        // returns the number of threads put into the array
        Thread[] tarray = new Thread[threadGroupOne.activeCount()];
        int count = threadGroupOne.enumerate(tarray);

        // prints active threads
        for (int i = 0; i < count; i++)
            System.out.println(tarray[i].getName() + " found");

        threadGroupOne.interrupt();
    }
}