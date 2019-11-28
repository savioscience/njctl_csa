/* Write a program that will ask a user to store a "magic word." Then,
the user can be asked to input a sentence and determine if they
used the magic word. Have the program repeat until the user
includes the magic word in their sentence.*/

import java.util.Scanner;

public class magicWord {
    public static void main(String[] args) {

        // collects username input
        System.out.print("Enter in a magic word: ");
        Scanner input = new Scanner(System.in);
        String mw = new String(input.next());
        mw = mw.toLowerCase();

        // This segment collects a sentence
        System.out.print("Write a sentence: ");
        input = new Scanner(System.in);
        String sentence = new String(input.next());
        sentence = sentence.toLowerCase();

        // This statement will compare strings to see if the magic word is used in the
        // sentence.
        while (!sentence.contains(mw)) {
            System.out.println("You did not use the magic word.");
            System.out.print("Enter your sentence: ");
            input = new Scanner(System.in);
            sentence = new String(input.next());
            sentence = sentence.toLowerCase();

        }
        System.out.println("You used \"" + mw + "\", the magic word!");

    }
}