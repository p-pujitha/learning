package com.interviewbit.sortings;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {4,2,6,5,1,3};
        for(int i=0; i<array.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[minIndex]){
                    minIndex=j;
                }
            }
            if(i!=minIndex){
                int temp = array[i];
                array[i]=array[minIndex];
                array[minIndex] =temp;
            }
        }

        for(int num:array){
            System.out.println(num);
        }
    }
}
