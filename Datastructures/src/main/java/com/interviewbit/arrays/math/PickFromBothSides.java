package com.interviewbit.arrays.math;

import java.util.ArrayList;
import java.util.List;

public class PickFromBothSides {
    /*
     Given an integer array A of size N.

You have to pick exactly B elements from either left or right end of the array A to get the maximum sum.

Find and return this maximum possible sum.

NOTE: Suppose B = 4 and array A contains 10 elements then

You can pick the first four elements or can pick the last four elements or can pick 1 from the front and 3 from the back etc. you need to return the maximum possible sum of elements you can pick.
*/
 /*
 * Example Input
Input 1:

 A = [5, -2, 3 , 1, 2]
 B = 3
Input 2:

 A = [1, 2]
 B = 1


Example Output
Output 1:

 8
Output 2:

 2


Example Explanation
Explanation 1:

 Pick element 5 from front and element (1, 2) from back so we get 5 + 1 + 2 = 8
Explanation 2:

 Pick element 2 from end as this is the maximum we can get*/


    public static int solve(ArrayList<Integer> A, int B) {

        int size = A.size();
        int currSum = 0;
        for(int i=0; i<B; i++){
            currSum+=A.get(i);
        }
        int maxSum = currSum;
        int incl = size-1, excl=B-1;
        while(incl>=0 && excl >=0){
            currSum += A.get(incl--);
            currSum-=A.get(excl--);
            maxSum = Math.max(currSum,maxSum);
            System.out.println(maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int b = 3;
        ArrayList<Integer> A = new ArrayList<>();
        A.add(5);
        A.add(-2);
        A.add(3);
        A.add(1);
        A.add(2);
        int maxSum = solve(A,b);
        System.out.println("Max Sum :" + maxSum);


    }

}
