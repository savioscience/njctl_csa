
/* Write a program to sum all rows and columns of the 2-D array.
Your program should compute the overall sum of all values in this
multidimensional array.
*/

import java.util.Arrays;
import java.util.Math;

public class SumRowsCols {
    public static void main(String[] args) {
        int[][] a = { {1,2,3}, {4,5,-1} };
        int sum = 0;
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                sum += a[row][col];
            }
        }
        System.out.println(sum);
    }
}
