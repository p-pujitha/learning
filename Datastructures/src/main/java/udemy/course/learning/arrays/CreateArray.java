package udemy.course.learning.arrays;

import java.util.Arrays;

public class CreateArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        System.out.println(Arrays.toString(arr)); //O(n)

        String[] alphabets = {"A", "B", "C", "D", "E"}; //-> O(1)
        System.out.println(Arrays.toString(alphabets));
    }
}
