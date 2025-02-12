package com.interviewbit.arrays.math;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MinStepsInfiniteGrid {
    /*
    * You are in an infinite 2D grid where you can move in any of the 8 directions

 (x,y) to
    (x-1, y-1),
    (x-1, y)  ,
    (x-1, y+1),
    (x  , y-1),
    (x  , y+1),
    (x+1, y-1),
    (x+1, y)  ,
    (x+1, y+1)
You are given a sequence of points and the order in which you need to cover the points.. Give the minimum number of steps in which you can achieve it. You start from the first point.

NOTE: This question is intentionally left slightly vague. Clarify the question by trying out a few cases in the “See Expected Output” section.



Problem Constraints
1 <= |A| <= 106
- 2 * 103 <= Ai, Bi <= 2 * 103
|A| == |B|


Input Format
Given two integer arrays A and B, where A[i] is x coordinate and B[i] is y coordinate of ith point respectively.



Output Format
Return an Integer, i.e minimum number of steps.



Example Input
Input 1:

 A = [0, 1, 1]
 B = [0, 1, 2]


Example Output
Output 1:

 2


Example Explanation
Explanation 1:

 Given three points are: (0, 0), (1, 1) and (1, 2).
 It takes 1 step to move from (0, 0) to (1, 1). It takes one more step to move from (1, 1) to (1, 2).
 *
 * */

    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();
        x.add(0);
        x.add(1);
        x.add(2);
        ArrayList<Integer> y = new ArrayList<>();
        y.add(0);
        y.add(1);
        y.add(2);

        int minSteps = coverPoints(x,y);
        System.out.println(minSteps);

    }
    public static int coverPoints(ArrayList<Integer> x, ArrayList<Integer> y) {
        int prevX = x.get(0);
        int prevY = y.get(0);
        int n = x.size();
        int ans =0;
        for(int i=1; i<n; i++){
            int currX = x.get(i);
            int currY = y.get(i);
            int diff_X = Math.abs(currX - prevX);
            int diff_Y = Math.abs(currY - prevY);
            ans+=Math.max(diff_X, diff_Y);
            prevX = currX;
            prevY = currY;
        }
        return ans;

        /*int ans = 0;
        for(int i = 0; i<x.size()-1; i++)
            ans += Math.max(Math.abs(x.get(i) - x.get(i + 1)),
                   Math.abs(y.get(i) - y.get(i + 1)));
        return ans;*/
    }


    }
