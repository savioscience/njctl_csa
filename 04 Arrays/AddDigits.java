/* Write a program that will add the digits
9, 5, 4, 2, and 1 and output the sum */

public class AddDigits {
    public static void main(String[] args) {
        int[] x = {9, 5, 4, 2, 1};
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        System.out.println(sum);
    }
}