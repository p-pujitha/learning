package udemy.course.learning.arrays;

public class InsertSingleDimensionalArray {
    int arr[] = null;

    InsertSingleDimensionalArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToBeInserted) { //Time complexity -> O(1)
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
                System.out.println("Value :" + valueToBeInserted + " is inserted in array");

            } else {
                System.out.println("Value: " + arr[location] + " is already exists in that location : " + location);
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Invalid location");
        }

    }

    public void traverseArray() { // Time complexity -> O(n)
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } catch (Exception ex) {
            System.out.println("Array traversing ended");
        }

    }

    public void searchElementInArray(int searchElement) { //Time complexity -> O(n)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                System.out.println("Element found at index :" + i);
                return;

            }
        }
        System.out.println("Element not found in the array ");
    }

    public void deleteValueAtSpecificIndex(int index) { //Time complexity -> O(1)
        try {
            if (arr[index] != Integer.MIN_VALUE) arr[index] = Integer.MIN_VALUE;
            System.out.println("Value has been deleted successfully");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
