/*The Mario program in Java (cs50)*/

import java.util.Scanner;

public class Mario {

    static int pyramidInfo() {
        Scanner input = new Scanner(System.in);

        
        int max = 0;

        do {
            System.out.print("What is the height of your pyramid (between 1 and 8?) ");
            try {
                max = input.nextInt();
            }
            catch(Exception exception){
                input.next();
                System.out.println("Invalid entry. Please enter in a number from 1 to 8.");
            }
        }
        while ((max < 1) || (max > 8));
            
        input.close();
        return max;
    }

    static void pyramid(int max) {

        for (int i = 1; i <= max; i++) {
            for (int j = 0; j < max; j++) {
                if (j < (max - i)) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }

            System.out.print(" ");
            for (int j = max; j > 0; j--) {
                if (j > (max - i)) {
                    System.out.print("#");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int max = pyramidInfo();
        pyramid(max);
    }
}