/*Create two integer variables a and b and store integer user input
to each of them. Determine if both a and b are greater/less than
25 or if one is greater and the other is less than 25. Output the
results.*/

import java.util.Scanner;
public class StoreInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the first number (integer)? ");
        int a = input.nextInt();
        
        System.out.print("What is the second number (integer)? ");
        int b = input.nextInt();

        System.out.println("Both are greater than 25: " + (a > 25 && b > 25));
        System.out.println("Both are less than 25: " + (a < 25 && b < 25));
        System.out.println("One of the variables is greater than 25: " + (a > 25 || b > 25));
    }
}