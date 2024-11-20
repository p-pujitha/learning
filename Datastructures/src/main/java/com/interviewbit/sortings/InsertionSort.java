package com.interviewbit.sortings;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]= {4,2,6,5,1,3};
        for(int i=1; i<arr.length;i++){
            int temp = arr[i];
            int j=i-1;
            while(j>=0 && temp<arr[j]){
                arr[j+1] = arr[j];
                arr[j]= temp;
                j--;
            }
        }
        for (int num:arr){
            System.out.println(num);
        }
    }
}
