package org.pujitha.learning.linkedlists;


import static org.pujitha.learning.linkedlists.ReverseLinkedList.printLinkedList;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);

        System.out.print("Original Linked List: ");
        printLinkedList(head);

        head = middleOfLinkedList(head);
        System.out.println(head.data);
    }

    private static Node middleOfLinkedList(Node head) {
        Node slow= head, fast= head;
        while(fast != null && fast.next != null && slow != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
