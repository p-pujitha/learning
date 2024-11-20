package com.interviewbit.sortings;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={5,4,7,1,3,2,8,6};
        int arr2[]=mergeSort(arr);
        for(int num:arr2){
            System.out.println(num);
        }
    }

    private static int[] mergeSort(int[] arr) {
        if(arr.length == 1) return arr;
        int mid = arr.length/2;
        int left[] = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int right[] = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);

    }

    private static int[] merge(int[] left, int[] right) {
        int i=0,j=0,index=0;
        int[] combined = new int[left.length+ right.length];
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                combined[index] = left[i];
                index++;
                i++;
            }else{
                combined[index] = right[j];
                index++;
                j++;
            }
        }
        while(i<left.length){
            combined[index] = left[i];
            index++;
            i++;
        }
        while (j<right.length){
            combined[index]= right[j];
            index++;
            j++;
        }
        return combined;
    }
}
