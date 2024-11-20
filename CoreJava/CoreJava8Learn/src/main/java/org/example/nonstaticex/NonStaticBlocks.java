package org.example.nonstaticex;

public class NonStaticBlocks {
    int num;

    NonStaticBlocks() {
        num = 10;
        System.out.println("Number :" + num);
    }

    {
        System.out.println("inside non static block");
    }

    public static void main(String[] args) {
        System.out.println("inside main method");
        NonStaticBlocks nonStaticBlocks = new NonStaticBlocks();

    }
    static {
        System.out.println("Inside static block");
    }
}
