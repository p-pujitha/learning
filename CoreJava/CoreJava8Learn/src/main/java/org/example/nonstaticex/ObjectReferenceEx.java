package org.example.nonstaticex;

public class ObjectReferenceEx {
    int x;
    ObjectReferenceEx(){
        System.out.println("inside constructor");
    }
    public static void main(String[] args) {
        ObjectReferenceEx ore = new ObjectReferenceEx();
        System.out.println(ore.x);
    }
}
