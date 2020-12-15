package com.practice.java._15javamultithreading;

/*
 * IPC is allowing synchronized threads to communicate with each other.
 * It is done using following methods of Object class
 * 1) wait() method : Causes current thread to release the lock and wait
 * until either another thread invokes the notify() method or the notifyAll()
 * method for this object, or a specified amount of time has elapsed.
 * 2) notify() method : Wakes up a single thread that is waiting on this object's monitor.
 * If any threads are waiting on this object, one of them is chosen to be awakened.
 * 3) notifyAll() method : Wakes up all threads that are waiting on this object's monitor*/

public class _13JavaBankInterThreadCommunication {

    int amount = 10000;

    public static void main(String args[]) {
        final _13JavaBankInterThreadCommunication javaBankInterThreadCommunication = new _13JavaBankInterThreadCommunication();
        new Thread() {
            public void run() {
                javaBankInterThreadCommunication.withdraw(15000);
            }
        }.start();
        new Thread() {
            public void run() {
                javaBankInterThreadCommunication.deposit(10000);
            }
        }.start();

    }

    synchronized void withdraw(int amount) {
        System.out.println("Going to withdraw...");

        if (this.amount < amount) {
            System.out.println("Less balance; waiting for deposit...");
            try {
                wait();
            } catch (Exception e) {
            }
        }
        this.amount -= amount;
        System.out.println("Withdraw completed...");
    }

    synchronized void deposit(int amount) {
        System.out.println("Going to deposit...");
        this.amount += amount;
        System.out.println("Deposit completed... ");
        notify();
    }
}