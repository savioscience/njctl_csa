/* Create an int array named num storing the values 1, 3, 4, 5
and create a String array called iceCream storing three
types of ice cream flavors. Print out a statement like the one
given below by accessing values in your arrays.
We bought 4 strawberry ice creams. */

import java.util.Scanner;

public class IceCream {
    public static void main(String[] args) {
        int [] values = {1, 3, 4, 5};
        String[] iceCream = {"Vanilla","Mint","Strawberry"};
        System.out.println ("We bought " + values[2] + " " + iceCream[2] + " ice creams.");
    }
}