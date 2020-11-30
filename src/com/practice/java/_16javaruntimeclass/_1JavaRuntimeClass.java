package com.practice.java._16javaruntimeclass;

import java.io.IOException;

public class _1JavaRuntimeClass {

    public static void main(String[] args) throws IOException {

        Runtime runtime=Runtime.getRuntime();

        System.out.println(runtime.availableProcessors());

        System.out.println("Total Memory: "+runtime.totalMemory());
        System.out.println("Free Memory: "+runtime.freeMemory());

        for(int i=0;i<10000;i++){
            new _1JavaRuntimeClass();
        }
        System.out.println("After creating 10000 instance, Free Memory: "+runtime.freeMemory());
        System.gc();

        System.out.println("After gc(), Free Memory: "+runtime.freeMemory());

        runtime.exec("notepad");

        runtime.exec("c:\\Windows\\System32\\shutdown -r -t 0");
    }
}
