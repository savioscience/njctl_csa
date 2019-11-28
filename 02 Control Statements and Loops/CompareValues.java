/*Write a code segment that will compare the values of two variables x
and y, and print to the screen "x is greater than or equal to y" or
"x is less than y" depending on the values assigned to the variables.*/

import java.util.Scanner;
public class CompareValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the first number (integer)? ");
        int x = input.nextInt();
        
        System.out.print("What is the second number (integer)? ");
        int y = input.nextInt();

        input.close();
        
        if (x > y) {
            System.out.println(x + " is greater than " + y);
        }
        else if (x < y) {
            System.out.println(x + " is less than " + y);
        }
        else if (x == y) {
            System.out.println(x + " and " + y + " are equal to each other.");
        }
    }
}