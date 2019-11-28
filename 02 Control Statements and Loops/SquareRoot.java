/*Write a program that will output the dimensions of a square
garden when a user inputs the total desired area of the garden.*/

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the area of your garden? ");
        int x = input.nextInt();

        double dimension = Math.sqrt(x);
        dimension = Math.floor(dimension * 100) / 100;


        System.out.println("Your garden should be a square with each dimension being " + dimension + " feet long.");
    }
}