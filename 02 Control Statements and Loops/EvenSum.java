/*Write a loop to compute the sum of the even numbers from a
to b.*/

import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a, b, evensum;

        System.out.print("What is the first even number (integer)? ");
        a = input.nextInt();
        while (a % 2 != 0) 
        { 
            System.out.println("Enter in an even number. Try again.");
            System.out.print("What is the first even number (integer)? ");
            a = input.nextInt();
        }
        
        
        System.out.print("What is the second even number (integer)? ");
        b = input.nextInt();
        while (b % 2 != 0) 
        { 
            System.out.println("Enter in an even number. Try again.");
            System.out.print("What is the second even number (integer)? ");
            b = input.nextInt();
        }
        

        evensum = 0;
        for (int i = a; i <= b; i +=2) {
            if (i % 2 == 0) {
                evensum += i;
            }
            //System.out.println("Evensum is: " + evensum);
        }
        System.out.println("The sum of the even numbers between " + a + " and " + b + " is " + evensum);
    }
}