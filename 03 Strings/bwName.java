/* Write a program that asks a user to input their name and then
outputs the first letter of their name.*/

import java.util.Scanner;

public class bwName {
    public static void main(String[] args) {

        // collects username input
        System.out.print("Enter in a name: ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        input.close();


        // Returns the name, backwards
        for (int i = name.length() - 1; i >= 0 ; i--) {
            char fPosition = name.charAt(i);
            System.out.print(fPosition);
        }        
    }
}