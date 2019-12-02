
/* write a program that sends an array down to a method, and
then returns an array where every number has been squared.*/

import java.util.Arrays;
import java.util.Math;

public class SquareIt {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] newA = squareIt(a);
        for (int i = 0; i < newA.length; i++) {
            System.out.print(newA[i] + " ");
        }
    }
    public static int[] squareIt(int[] x){
        for (int i = 0; i < x.length; i++) {
            x[i] = (int) Math.pow(x[i], 2);
        }
        return x;
    }
}
