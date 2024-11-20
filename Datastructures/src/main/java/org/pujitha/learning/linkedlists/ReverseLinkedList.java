package org.pujitha.learning.linkedlists;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class ReverseLinkedList {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);

        System.out.print("Original Linked List: ");
        printLinkedList(head);

         head = reverseLinkedList(head);
         printLinkedList(head);

    }

    private static Node reverseLinkedList(Node head) {
        Node temp = head;
        Node prev = null;
        while(temp!=null){
            Node next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }


    static void printLinkedList(Node head){
        Node temp = head;
        while(temp !=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

}
