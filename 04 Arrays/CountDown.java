/* take the countDown array and have its elements
printed out backwards in order to countdown to LAUNCH! */


public class CountDown {
    public static void main(String[] args) {
        int [] countDown = new int [10];

        // this for loop fill the array with values
        for (int i = 0; i < 10; i++) {
            countDown[i] = i + 1;
            System.out.println(i + " => countdown[i]: " +countDown[i]);
        }
        // this for loop prints it out.
        for (int i = 9; i >= 0; i--) {
            System.out.println (countDown[i]);
        }
        System.out.println ("LAUNCH!");
    }
}