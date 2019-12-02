/* Write a program to fill an array with even numbers from 0 to 50.
Print the array. */

public class FillEvenNumbers {
    public static void main(String[] args) {
        int [] evenNums = new int[26];
        int evens = 0;
        // This for loop will fill the array with even values from 0 to 50
        for (int i = 0; i < evenNums.length; i++) {
            evenNums[i] = evens;
            evens = evens + 2;
            // you can also do evenNums[i] = i * 2;
            // System.out.println(i + " => evenNums[i]: " +evenNums[i]);
            // System.out.println(i + " evens: " + evens);

        }

        // this for loop prints it out.
        for (int i = 0; i < evenNums.length; i++) {
            System.out.print(evenNums[i] + " ");
        }
    }
}