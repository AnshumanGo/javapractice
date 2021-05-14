package com.practice.java._1firstjavaprogram;

public class _1HelloWorld {
/*
* If void keyword is removed then it will have two errors, methods need to have return type and static can not be used
* If static keyword is removed, Main method is not static in class
* If public keyword is removed , Main method not found in class
* If public and static keyword is removed , Main method not found in class
* If main removed then it will give error, java: <identifier> expected
* */
     public static void main(String[] args) {

         /*
         * Is System is removed,it will give error "cannot find symbol, symbol: variable out
         * location: class com.practice.java._1firstjavaprogram._1HelloWorld"
         *
         * If out is removed from below it will give "cannot find symbol, symbol:   method println(java.lang.String)
         * location: class java.lang.System"
         *
         * If println is removed from below it will give "cannot find symbol, symbol:   method out(java.lang.String)
         * location: class java.lang.System"
         *
         * If out and println removed, then it will give error "cannot find symbol, symbol:   method System(java.lang.String)
         * location: class com.practice.java._1firstjavaprogram._1HelloWorld"
         *
         * If System and out removed, then it will give error "cannot find symbol, symbol:   method println(java.lang.String)
         * location: class com.practice.java._1firstjavaprogram._1HelloWorld"
         *
         * Similarly if a dot(.) is missed then it will give relative symbol not found
         * */

        System.out.println("_1HelloWorld.main");

        /*
        ==>>class keyword is used to declare a class in java.

        ==>>public keyword is an access modifier which represents visibility. It means it is visible to all.

        ==>>static is a keyword. If we declare any method as static, it is known as the static method.

        The core advantage of the static method is that there is no need to create an object to invoke the static method.
        The main method is executed by the JVM, so it doesn't require to create an object to invoke the main method.
        So it saves memory.

        ==>>void is the return type of the method. It means it doesn't return any value.

        ==>>main represents the starting point of the program.

        ==>>String[] args is used for command line argument.

        ==>>System.out.println() is used to print statement.
        Here, System is a class, out is the object of PrintStream class, println() is the method of PrintStream class.
        */

    }
}
