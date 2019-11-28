/*Create a program that asks a user to input an amount of money
($) and then outputs how many dollars and cents you have
separately.*/

import java.util.Scanner;

public class DollarsCents {
    public static void main(String[] args) {
        
        System.out.print("Enter in a value in dollars and cents in the format X.XX: ");
        Scanner input = new Scanner(System.in);
        double val = input.nextDouble();
       
        int dollars = (int)val;
        // you could add 0.01 to account for overflow?
        int cents = (int) (((val - dollars)*100) + 0.01);
       
       
        System.out.println("You have " + dollars + " dollar(s) in bills and " + cents + " cents in coins.");
    }
}