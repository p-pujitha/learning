package com.interviewbit.sortings;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {4, 6, 1, 7, 3, 2, 5};
        int arr2[] = pivotSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr2));
    }

    private static int[] pivotSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = findPivotIndex(arr, left, right);
            pivotSort(arr, left, pivotIndex - 1);
            pivotSort(arr, pivotIndex + 1, right);
        }
        return arr;
    }

    private static int findPivotIndex(int[] arr, int left, int right) {
        int pivot = arr[left];
        int swapIndex = left;
        for (int i = left + 1; i <= right; i++) {
            if (arr[i] < pivot) {
                swapIndex++;
                swapValues(arr, swapIndex, i);
            }
        }
        swapValues(arr, left, swapIndex);
        return swapIndex;
    }

    private static void swapValues(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
