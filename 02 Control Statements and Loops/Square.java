/*Write a program that will ask a user to input a number and it will
print out the square of that number.
For example, if a user inputs 4, the output would be 16, since
4^2 = 16.*/

import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What number do you want to square? ");
        int x = input.nextInt();
        
        System.out.println(x + " squared is: " + Math.pow(x, 2));
    }
}