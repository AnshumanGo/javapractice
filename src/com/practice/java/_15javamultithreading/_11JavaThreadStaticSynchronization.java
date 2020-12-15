package com.practice.java._15javamultithreading;

public class _11JavaThreadStaticSynchronization {

    /*
    *  If you make any static method as synchronized, the lock will be on the class not on object.
       Problem without static synchronization
       * Suppose there are two objects of a shared class(e.g. Table) named object1 and object2.
       * In case of synchronized method and synchronized block there cannot be interference between
       * t1 and t2 or t3 and t4 because t1 and t2 both refers to a common object that have a single lock.
       * But there can be interference between t1 and t3 or t2 and t4 because t1 acquires another lock
       * and t3 acquires another lock.I want no interference between t1 and t3 or t2 and t4.
       * Static synchronization solves this problem. */
    synchronized static void printTable(int n) {

        for (int i = 1; i <= 10; i++) {

            System.out.println(n * i);
            try {

                Thread.sleep(400);
            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) {

        Thread t1 = new Thread() {

            public void run() {

                _11JavaThreadStaticSynchronization.printTable(1);
            }
        };

        Thread t2 = new Thread() {

            public void run() {

                _11JavaThreadStaticSynchronization.printTable(10);
            }
        };

        Thread t3 = new Thread() {

            public void run() {

                _11JavaThreadStaticSynchronization.printTable(100);
            }
        };

        Thread t4 = new Thread() {

            public void run() {

                _11JavaThreadStaticSynchronization.printTable(1000);
            }
        };

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}