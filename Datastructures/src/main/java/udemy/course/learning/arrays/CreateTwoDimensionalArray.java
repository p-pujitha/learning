package udemy.course.learning.arrays;

import java.util.Arrays;

public class CreateTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] twoDArray;
        twoDArray = new int[2][2];
        twoDArray[0][0] = 1;
        twoDArray[0][1] = 2;
        twoDArray[1][0] = 3;
        twoDArray[1][1] = 4;

        System.out.println(Arrays.deepToString(twoDArray));

        String[][] sTwoDArray = {{"a", "b"}, {"c", "d"}};
        System.out.println(Arrays.deepToString(sTwoDArray));
    }
}
