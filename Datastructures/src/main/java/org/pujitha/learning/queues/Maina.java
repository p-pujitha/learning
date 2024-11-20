package org.pujitha.learning.queues;

public class Maina {
    public static void main(String[] args) {
        Queue queue = new Queue(1);
        queue.getFirst();
        queue.getLast();
//        queue.printQueue();
        queue.enqueue(2);
        queue.enqueue(3);
        queue.printQueue();
        System.out.println("After removing the element");
        queue.dequeue();
        queue.printQueue();

    }
}
