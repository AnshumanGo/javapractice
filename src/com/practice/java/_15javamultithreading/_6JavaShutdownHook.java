package com.practice.java._15javamultithreading;

public class _6JavaShutdownHook extends Thread {

    public static void main(String[] args) {

        //Used to perform cleanup resource or save the state when JVM shuts down normally or abruptly.
        //Performing clean resource means closing log file, sending some alerts or something else.
        //But this will not take care abruptly taking our power source of machine.

        _6JavaShutdownHook javaShutdownHook = new _6JavaShutdownHook();
        Runtime runtime = Runtime.getRuntime();
        runtime.addShutdownHook(javaShutdownHook);

        System.out.println("Now main sleeping ... Press ctrl+c to exit");
        System.exit(0);
        try {

            Thread.sleep(65000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        System.out.println("Shutdown task completed");
    }
}
