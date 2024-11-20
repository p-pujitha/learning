package org.example.arrays;

public class SDATest {
    public static void main(String[] args) {
        SingleDimensionArray sda = new SingleDimensionArray(5);
        sda.insert(0,10);
        sda.insert(1,2);
        sda.insert(3,7);
        sda.insert(3,9);
        sda.traverseArray();
    }
}
