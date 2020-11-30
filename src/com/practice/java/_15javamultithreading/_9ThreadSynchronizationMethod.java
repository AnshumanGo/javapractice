package com.practice.java._15javamultithreading;

public class _9ThreadSynchronizationMethod {

    synchronized void printTable(int n){//synchronized method

        for(int i=1;i<=5;i++){

            System.out.println(n*i);
            try{

                Thread.sleep(400);
            }catch(Exception e){

                System.out.println(e);
            }
        }

    }

    public static void main(String args[]){

        final _9ThreadSynchronizationMethod obj = new _9ThreadSynchronizationMethod();//only one object

        Thread t1=new Thread(){
            public void run(){
                obj.printTable(5);
            }
        };
        Thread t2=new Thread(){
            public void run(){
                obj.printTable(100);
            }
        };

        t1.start();
        t2.start();
    }
}