package org.example.arrays;

public class SingleDimensionArray {
  int arr[] = null;

  public SingleDimensionArray(int sizeOfArray) { // 5
    arr = new int[sizeOfArray];
    for (int i=0; i<arr.length; i++) {
      arr[i] = Integer.MIN_VALUE;
    }
  }

  public void insert(int location, int valueToBeInserted) {
    try {
        if (arr[location] == Integer.MIN_VALUE) {
            arr[location] = valueToBeInserted;
            System.out.println("Successfully inserted");
          } else {
            System.out.println("This cell is already occupied");
          }
       } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Invalid index to access array!");
      }
  }


  // Array Traversal

  public void traverseArray() {
    try {
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
      }
    } catch (Exception e) {
      System.out.println("Array no longer exists!");
    }

  }



}
