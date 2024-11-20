package com.interviewbit.arrays.math;

import java.util.ArrayList;

public class MinLightsToActivate {
    /*
    * There is a corridor in a Jail which is N units long. Given an array A of size N. The ith index of this array is 0 if the light at ith position is faulty otherwise it is 1.

All the lights are of specific power B which if is placed at position X, it can light the corridor from [ X-B+1, X+B-1].

Initially all lights are off.

Return the minimum number of lights to be turned ON to light the whole corridor or -1 if the whole corridor cannot be lighted.



Problem Constraints
1 <= N <= 100000

1 <= B <= 10000



Input Format
First argument is an integer array A where A[i] is either 0 or 1.

Second argument is an integer B.



Output Format
Return the minimum number of lights to be turned ON to light the whole corridor or -1 if the whole corridor cannot be lighted.


Example Input
Input 1:

A = [ 0, 0, 1, 1, 1, 0, 0, 1].
B = 3
Input 2:

A = [ 0, 0, 0, 1, 0].
B = 3


Example Output
Output 1:

2
Output 2:

-1


Example Explanation
Explanation 1:

In the first configuration, Turn on the lights at 2nd and 7th index.
Light at 2nd index covers from [ 1, 5] and light at 7th index covers [6, 8].
Explanation 2:

In the second configuration, there is no light which can light the first corridor.
* \
* ']*/

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(0);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(0);
        list.add(0);
        list.add(1);
        int b =  3;
        int lighted = solve(list, b);
        System.out.println("How many lights to be turned on :" + lighted);



    }
    public static int solve(ArrayList<Integer> A, int B) {
        int count =0;
        int size = A.size();
        int i=0;
        while(i<size){
            int right = Math.min(i+B-1,size-1);
            int left = Math.max(i-B+1,0);
            boolean bulbFound = false;
            while(right >= left ){
                if(A.get(right) == 1){
                    bulbFound = true;
                    break;
                }
                right--;
            }
            if(!bulbFound) return -1;
            count++;
            i=right+B;
        }
        return count;
    }

    }
