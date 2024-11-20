package org.pujitha.learning.linkedlists;

public class Add2Numbers {
    public static void main(String[] args) {

        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);

        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(6);

        ReverseLinkedList.printLinkedList(list1);
        ReverseLinkedList.printLinkedList(list2);
        Node list = addTwoLists(list1, list2);
        ReverseLinkedList.printLinkedList(list);
    }

    private static Node addTwoLists(Node list1, Node list2) {
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;
        int carry=0;
        while(list1!=null || list2!=null || carry==1){
            int sum = 0;
            if(list1!=null){
                sum+=list1.data;
                list1 = list1.next;
            }
            if(list2!=null){
                sum+=list2.data;
                list2=list2.next;
            }
            sum+=carry;
            carry = sum/10;
            Node newNode = new Node(sum%10);
            temp.next = newNode;
            temp = temp.next;
        }
        return dummyNode.next;
    }
}
