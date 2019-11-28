/* write a program to check if a user's name begins and
ends with the same character*/

import java.util.Scanner;

public class checkUsername {
    public static void main(String[] args) {

        // collects username input
        System.out.print("Enter in a name: ");
        Scanner input = new Scanner(System.in);
        String theName = new String(input.next());

        // Stores the first letter in first
        char first = theName.charAt(0);

        // Identifies last index of name
        int lastIndex = theName.length() - 1;

        // Stores the last letter in last
        char last = theName.charAt(lastIndex);

        // Compare first and last char and output
        if (first == last) {
            System.out.print("The first and last letter in your name are the same!");
        } 
        else {
            System.out.print("The first and last letter in your name do not match!");
        }
    }
}