package com.interviewbit.arrays.math;

import java.util.ArrayList;
import java.util.TreeSet;

public class MaxSumTriplet {

    /**
     * Given an array A containing N integers.
     *
     * You need to find the maximum sum of triplet ( Ai + Aj + Ak ) such that 0 <= i < j < k < N and Ai < Aj < Ak.
     *
     * If no such triplet exist return 0.
     *
     *
     *
     * Problem Constraints
     * 3 <= N <= 105.
     *
     * 1 <= A[i] <= 108.
     *
     *
     *
     * Input Format
     * First argument is an integer array A.
     *
     *
     *
     * Output Format
     * Return a single integer denoting the maximum sum of triplet as described in the question.
     *
     *
     *
     * Example Input
     * Input 1:
     *
     *  A = [2, 5, 3, 1, 4, 9]
     * Input 2:
     *
     *  A = [1, 2, 3]
     *
     *
     * Example Output
     * Output 1:
     *
     *  16
     * Output 2:
     *
     *  6
     *
     *
     * Example Explanation
     * Explanation 1:
     *
     *  All possible triplets are:-
     *     2 3 4 => sum = 9
     *     2 5 9 => sum = 16
     *     2 3 9 => sum = 14
     *     3 4 9 => sum = 16
     *     1 4 9 => sum = 14
     *   Maximum sum = 16
     * Explanation 2:
     *
     *  All possible triplets are:-
     *     1 2 3 => sum = 6
     *  Maximum sum = 6
     */
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();
        test.add(2);
        test.add(5);
        test.add(3);
        test.add(1);
        test.add(4);
        test.add(9);
        int maxSum = findTripletSum(test);
        System.out.println(maxSum);

    }
    public static int findTripletSum(ArrayList<Integer> A) {
        int n = A.size();
//        System.out.println("Size :"+ n);
        int sum =0;
        ArrayList<Integer> rightbestArray = new ArrayList<Integer>(n);
        for(int i=0; i<n; i++){
            rightbestArray.add(0);
        }
//        System.out.println(rightbestArray.size());
        for(int i=n-1; i>=0; i--){
            if(i==n-1) rightbestArray.set(i,A.get(i));
            else {
                int setValue = Math.max(A.get(i), rightbestArray.get(i + 1));
                rightbestArray.set(i, setValue);
            }
        }
//        System.out.println("Right best array :"+ rightbestArray);
        TreeSet<Integer> leftArray = new TreeSet<>();
        leftArray.add(A.get(0));
        for(int i=1; i<n; i++){
            leftArray.add(A.get(i));
            if(leftArray.lower(A.get(i)) !=null && A.get(i) != rightbestArray.get(i)){
                 sum = Math.max(leftArray.lower(A.get(i))+ A.get(i) + rightbestArray.get(i),sum);
            }

        }
        return sum;
    }
}
