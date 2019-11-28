/* Write a program that asks a user to input their name and then
outputs the first letter of their name.*/

import java.util.Scanner;

public class fLetterName {
    public static void main(String[] args) {

        // collects username input
        System.out.print("Enter in a name: ");
        Scanner input = new Scanner(System.in);
        String fletterName = input.next();
        input.close();

        // Stores the first letter in first position
        char fPosition = fletterName.charAt(0);
        System.out.print("Your name begins with the letter " + fPosition);
        
    }
}