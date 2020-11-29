package com.practice.java._15javamultithreading;

import java.util.concurrent.*;

public class _4JavaScheduledThreadPool implements Runnable {

    private String message;

    public _4JavaScheduledThreadPool(String s){

        this.message=s;
    }

    public void run() {

        System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);
        processMessage();
        System.out.println(Thread.currentThread().getName()+" (End)");
    }

    private void processMessage() {
        try {

            Thread.sleep(10);
        } catch (InterruptedException e) {

            e.printStackTrace(); }
    }

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch lock = new CountDownLatch(3);

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
        ScheduledFuture<?> future = executor.scheduleAtFixedRate(() -> {
            System.out.println("Hello World");
            lock.countDown();
        }, 500, 100, TimeUnit.MILLISECONDS);

        lock.await(1000, TimeUnit.MILLISECONDS);
        future.cancel(true);

        for (int i = 0; i < 5; i++) {

            Runnable worker = new _3JavaThreadPool("" + i);
            executor.execute(worker);
        }

        executor.shutdown();
        while (!executor.isTerminated()) {

        }

        System.out.println("Finished all threads");
    }
}