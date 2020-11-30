package com.practice.java._15javamultithreading;

public class _8JavaMultipleTaskMultipleThread {

    public static void main(String[] args) {

        FirstTask firstTask = new FirstTask();
        Thread threadFirstTask = new Thread(firstTask);

        SecondTask threadSecondTask = new SecondTask();

        threadFirstTask.start();
        threadSecondTask.start();
    }
}


class FirstTask implements Runnable{

    @Override
    public void run(){

        System.out.println("First Task");
    }
}

class SecondTask extends Thread{

    @Override
    public void run(){

        System.out.println("Second Task");
    }
}