/* Write a program that takes a String user input and determines
if there are any vowels in the string.*/

import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {

        // This segment collects a sentence
        System.out.print("Write a word or bunch of words: ");
        Scanner input = new Scanner(System.in);
        String word = new String(input.next());
        word = word.toLowerCase();
        input.close();
        boolean foundVowel = false;


        // This statement will compare strings to see if there is a vowel.
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Entered character " + ch + " is a vowel");
                foundVowel = true;
            }            
        }

        if (!foundVowel) {
            System.out.println ("No vowels found");
        } 
    }
}