package org.pujitha.learning.bst;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        System.out.println("Root default value :"+bst.root);
        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(52);
        bst.insert(82);
        bst.insert(27);
        System.out.println(bst.root.left.right.value);
        System.out.println("Is 27 present in tree ? :"+bst.contains(27));
        System.out.println("Is 20 present in tree ? : "+ bst.contains(20));
    }
}
