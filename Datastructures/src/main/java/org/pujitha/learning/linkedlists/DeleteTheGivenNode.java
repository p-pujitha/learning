package org.pujitha.learning.linkedlists;

public class DeleteTheGivenNode {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);
        Node node = deleteNode(head, 4);
        ReverseLinkedList.printLinkedList(node);
    }

    private static Node deleteNode(Node head, int value) {
        Node t = getNode(head,value);
        deleteNode(t);
        return  head;
    }

    private static Node getNode(Node head, int value) {
        Node temp = head;
        while (temp.data != value) {
            temp = temp.next;
        }
        return temp;
    }

    private static void deleteNode(Node t) {
        if (t == null)
            return;
        if(t.next!=null){
            t.data = t.next.data;
            t.next = t.next.next;
        }
    }
}
