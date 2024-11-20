package org.pujitha.learning.hashtable;

public class HashTable {
    private int size  = 7;
    private Node[] dataMap ;
    class Node{
        String key;
        int value;
        Node next;

        Node(String key, int value){
            this.key = key;
            this.value = value;
        }
    }
    HashTable(){
        dataMap = new Node[size];
    }

    public void printHashTable()
    {
        for(int i=0; i<size; i++){
            Node temp = dataMap[i];
            while(temp !=null){
                System.out.println("Key : "+ temp.key);
                System.out.println("Value :"+temp.value);
                temp= temp.next;
            }
        }
    }

    private int hash(String key){
        int hash =0;
         char[] keychars = key.toCharArray();
         for(int i=0; i<keychars.length; i++){
             int asciiValue = keychars[i];
             hash = (hash + asciiValue * 23)%dataMap.length;
         }
         return hash;
    }
}
