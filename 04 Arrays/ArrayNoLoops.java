/* write a program that takes
an int array, and does the following to each element in the array, but
without using any loops. (The array we start out with is [3|7|2])
1) adds 5 to it
2) multiplies it by 3
3) prints it to the terminal window
4) and finally subtracts 4 from it */


public class ArrayNoLoops {
    public static void main(String[] args) {
        int[] xyz = new int[3];
        xyz[0] = calculate(3);
        xyz[1] = calculate(7);
        xyz[2] = calculate(2);
    }
    public static int calculate(int n) {
        // n is set to 3, 7, 2
        n += 5; // n is now 8, 12, 7
        n *= 3; // n is now 24, 36, 21
        System.out.println(n); // prints 24, 36, 21
        n -= 4; // n is now 20, 32, 17
        return n; // sends back 20, 32, 17 to be saved in xyz[0], xyz[1], and xyz[2] respectively
    }
}