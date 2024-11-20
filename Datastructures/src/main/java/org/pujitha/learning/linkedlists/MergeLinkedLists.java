package org.pujitha.learning.linkedlists;

import static org.pujitha.learning.linkedlists.ReverseLinkedList.printLinkedList;

public class MergeLinkedLists {
    public static void main(String[] args) {
        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);

        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(6);

        System.out.print("First sorted linked list: ");
        printLinkedList(list1);

        System.out.print("Second sorted linked list: ");
        printLinkedList(list2);

        Node linkedList = mergedLinkedLists(list1, list2);
        printLinkedList(linkedList);

    }

    private static Node mergedLinkedLists(Node list1, Node list2) {

        Node dummyNode = new Node(-1);
        Node temp = dummyNode;
        while(list1!= null && list2!= null){
            if(list1.data<=list2.data){
                temp.next = list1;
                list1 = list1.next;
            }else{
                temp.next = list2;
                list2 =list2.next;
            }
            temp = temp.next;
        }

        if(list1!=null){
            temp.next = list1;
        }else{
            temp.next = list2;
        }
        return  dummyNode.next;
    }
}
