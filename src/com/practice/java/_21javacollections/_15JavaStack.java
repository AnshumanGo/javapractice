package com.practice.java._21javacollections;

import java.util.Stack;

public class _15JavaStack {

    public static void main(String[] args) {

        //creating an instance of Stack class
        Stack<String> nameStack= new Stack<>();

        // checking stack is empty or not
        System.out.println("Is the stack empty? " + nameStack.empty());

        // pushing elements into stack
        nameStack.push("Ram");
        nameStack.push("Karan");
        nameStack.push("Shyam");
        nameStack.push("Arjun");
        //prints elements of the stack
        System.out.println("Elements in Stack: " + nameStack);

        System.out.println("Is the stack empty? " + nameStack.empty());

        System.out.println("First element in stack is : "+nameStack.firstElement());
        System.out.println("Last element in stack is : "+nameStack.lastElement());

        System.out.println("Top element removed is : "+nameStack.pop());
        System.out.println("Elements in Stack: " + nameStack);

        System.out.println("Top element removed is : "+nameStack.pop());
        System.out.println("Elements in Stack: " + nameStack);

        System.out.println("Top element removed is : "+nameStack.pop());
        System.out.println("Elements in Stack: " + nameStack);

        System.out.println("Top element is : "+nameStack.peek());

        System.out.println("Top element removed is : "+nameStack.pop());
        System.out.println("Elements in Stack: " + nameStack);

        System.out.println("Is the stack empty? " + nameStack.empty());
    }
}
