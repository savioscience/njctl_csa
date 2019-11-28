/* Caroline Savio-Ramos
Lab 02 - Ask the user to type in two positive integers greater than one.  
Make sure the inputted values satisfy the criteria.  Find the lowest common 
factor of the two numbers.  If one or both of the numbers are prime, let 
the user know.*/

import java.util.Scanner;

public class labLCF {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is the 1st positive integer greater than 1? ");
        int intInfo1 = input.nextInt();

        System.out.print("What is the 2nd positive integer greater than 1? ");
        int intInfo2 = input.nextInt();

        input.close();
        int n;    
        if (intInfo1 > intInfo2) {
            n = intInfo1;
        }
        else {
            n = intInfo2;
        }
        
        boolean foundLcf = false;

        for (int i = 2; i <= n; i++) {
            if ((intInfo1 % i == 0) && (intInfo2 % i == 0)) {
                int lcf = i;
                foundLcf = true;
                System.out.println("The lowest common factor between the two numbers is " + lcf);
            }
        }
                
        if  (foundLcf == false){
            System.out.println("One of the numbers is prime.");    
        }
    }
        
}

    
