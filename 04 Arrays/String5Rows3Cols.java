
/* Given the list of names below, initialize a five row, two column 2D
array with the values and print it out as a table.
Mike Joe Emily Katie Nicole Laura Dixie Steve Chris Sean
*/

import java.util.Arrays;
import java.util.Math;

public class String5Rows3Cols {
    public static void main(String[] args) {
        String [][] a = new String [5][2];
        a[0][0] = "Mike ";
        a[1][0] = "Joe ";
        a[2][0] = "Emily ";
        a[3][0] = "Katie ";
        a[4][0] = "Nicole ";

        a[0][1] = " Laura";
        a[1][1] = " Dixie";
        a[2][1] = " Steve";
        a[3][1] = " Chris";
        a[4][1] = " Sean";


        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                System.out.print(a[row][col]);
            }
        System.out.println();
        }
    }
}
