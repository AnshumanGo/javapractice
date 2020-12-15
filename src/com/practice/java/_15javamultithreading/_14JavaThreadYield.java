package com.practice.java._15javamultithreading;

public class _14JavaThreadYield extends Thread {
    public static void main(String[] args) {
        _14JavaThreadYield t1 = new _14JavaThreadYield();
        _14JavaThreadYield t2 = new _14JavaThreadYield();
        // this will call run() method
        t1.start();
        t1.yield();
        t2.start();
        for (int i = 0; i < 3; i++) {
            // Control passes to child thread

            System.out.println(Thread.currentThread().getName() + " thread in control");
        }
       /* t1.interrupt();
        t2.interrupt();*/
    }

    public void run() {
        for (int i = 0; i < 5; i++) {

            System.out.println(Thread.currentThread().getName() + " in control");

            try {
                Thread.currentThread().wait();
            } catch (InterruptedException e) {

                Thread.currentThread().notifyAll();
            }
        }

    }
}
