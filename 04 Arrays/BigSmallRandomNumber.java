/* Write a program to initialize an array to random numbers and find the
biggest and smallest. */

import java.util.Arrays;
import java.util.Math;

public class BigSmallRandomNumber {
    public static void main(String[] args) {
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);
        }

        int min = nums[0], max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        
        System.out.println("Math.min: " + min);
        System.out.println("Math.max: " + max);
    }
}
