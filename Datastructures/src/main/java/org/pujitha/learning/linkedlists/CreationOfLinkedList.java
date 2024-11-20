package org.pujitha.learning.linkedlists;

class LinkedList{
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }
   public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
}
public class CreationOfLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(4);

    }
}

