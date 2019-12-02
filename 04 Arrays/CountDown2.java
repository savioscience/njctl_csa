/* take the countDown array and have its elements
printed out backwards in order to countdown to LAUNCH! */

public class CountDown2 {
    public static void main(String[] args) {
        int[] countDown = new int[10];
        for (int i = 0; i < 10; i++) {
            countDown[i] = 10 - i;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println (countDown[i] + "...");
        }
            System.out.println ("LAUNCH!");
    }
}