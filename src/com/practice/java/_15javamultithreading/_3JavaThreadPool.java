package com.practice.java._15javamultithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _3JavaThreadPool implements Runnable {

    private String message;

    public _3JavaThreadPool(String s) {

        this.message = s;
    }

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 2; i++) {

            Runnable worker = new _3JavaThreadPool("" + i);
            executor.execute(worker);
        }

        executor.shutdown();
        while (!executor.isTerminated()) {

        }

        System.out.println("Finished all threads");
    }

    public void run() {

        System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
        processMessage();
        System.out.println(Thread.currentThread().getName() + " (End)");
    }

    private void processMessage() {
        try {

            Thread.sleep(10);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}