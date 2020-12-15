package com.practice.java._15javamultithreading;

public class _2JavaThreadSleep extends Thread {
    public static void main(String args[]) {
        _2JavaThreadSleep t1 = new _2JavaThreadSleep();
        _2JavaThreadSleep t2 = new _2JavaThreadSleep();

        t1.start();
        t2.start();
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {

           /*try{

               Thread.sleep(10);
           }catch(InterruptedException e){

               System.out.println(e);
           }*/
            System.out.println(i);
        }
    }
}