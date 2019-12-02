
/* Array will look like this:
|1|2|3|
|4|5|6|
*/

import java.util.Arrays;
import java.util.Math;

public class Example2DArray {
    public static void main(String[] args) {
        int[][] a = new int[2][3]; // size of array: 2 rows, 3 columns
        int x = 1; // declare a counter variable which will fill the cells with the correct numbers
        for (int row = 0; row < a.length; row++) { // use "row" instead of "i"
            for (int col = 0; col < a[row].length; col++) { // use "col" instead of "j"
                a[row][col] = x;
                x++;
                System.out.print(a[row][col]);
            }
            System.out.println();
        }
    }
}
