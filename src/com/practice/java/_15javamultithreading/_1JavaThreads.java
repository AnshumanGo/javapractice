package com.practice.java._15javamultithreading;

public class _1JavaThreads {

    public static void main(String[] args) {

        ThreadsByThread threadsByThread = new ThreadsByThread();
        threadsByThread.start();

        ThreadsByRunnable threadsByRunnable = new ThreadsByRunnable();
        Thread thread = new Thread(threadsByRunnable);
        thread.start();
    }
}

class ThreadsByThread extends Thread {

    public void run() {

        System.out.println("Thread is running using Thread");
    }
}

class ThreadsByRunnable implements Runnable {

    public void run() {

        System.out.println("Thread is running using Runnable");
    }
}