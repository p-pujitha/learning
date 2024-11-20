package udemy.course.learning.linkedlists;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(10);
        linkedList.append(20);
        linkedList.append(30);
//        linkedList.printList();
//        linkedList.removeLast();
//        linkedList.printList();
        linkedList.prepend(5);
//        linkedList.printList();
//        linkedList.removeFirst();
//        linkedList.printList();
       LinkedList.Node temp =  linkedList.getIndex(1);
//       System.out.println(temp.value);
       boolean temp2 = linkedList.setIndex(1,90);
//       System.out.println(temp2);
//       linkedList.printList();
       linkedList.insert(1,88);
//       linkedList.printList();
        LinkedList.Node temp3 = linkedList.remove(1);
//        System.out.println(temp3.value);
        linkedList.printList();
        linkedList.reverse();
        linkedList.printList();


    }
}
