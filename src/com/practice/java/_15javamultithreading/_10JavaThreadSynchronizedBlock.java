package com.practice.java._15javamultithreading;

public class _10JavaThreadSynchronizedBlock {

    void printTable(int n){
        /*Used to perform synchronization on any specific resource of the method.
        If you want to synchronize only 5 lines, you can use synchronized block.
        If you put all the codes of the method in the synchronized block, it will work same as the synchronized method.*/
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