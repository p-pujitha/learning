package org.pujitha.learning.stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(4);
//        stack.printStack();
//        stack.getHeight();
//        stack.getTop();

        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.printStack();
        stack.pop();
        System.out.println("After popping the element ");
        stack.printStack();


    }
}
