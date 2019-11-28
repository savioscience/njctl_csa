/*Find the sum of the multiples of 3 and 5 from 1 to 1000.*/

import java.util.Scanner;

public class MultiplesThreeandFivefromOnetoThousand {
    public static void main(String[] args) {
        int sumMultFive = 1;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                sumMultFive += i;
            }
        }
        System.out.println("The sum of the multiples of 3 and 5 from 1 to 1000 is: " + sumMultFive);
    }
}