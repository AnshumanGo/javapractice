package com.practice.java._15javamultithreading;

public class _10JavaThreadSynchronizedBlock {

    void printTable(int n){

        synchronized(this){//synchronized block

            for(int i=1;i<=10;i++){

                System.out.println(n*i);
                try{

                    Thread.sleep(200);
                }catch(Exception e){

                    System.out.println(e);
                }
            }
        }
    }

    public static void main(String args[]){

        final _10JavaThreadSynchronizedBlock javaThreadSynchronizedBlock = new _10JavaThreadSynchronizedBlock();//only one object

        Thread t1=new Thread(){

            public void run(){

                javaThreadSynchronizedBlock.printTable(2);
            }
        };
        Thread t2=new Thread(){

            public void run(){

                javaThreadSynchronizedBlock.printTable(3);
            }
        };

        t1.start();
        t2.start();
    }
}