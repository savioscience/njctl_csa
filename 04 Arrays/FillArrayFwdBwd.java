/* Part A: Write a program to fill an array with numbers from 1 to
100, then output the sum of the array. */

public class FillArrayFwdBwd {
    public static void main(String[] args) {
        int [] nums = new int[100];
        int n = 1;
        
        // This for loop will fill the array with values 1 to 100
        System.out.println();
        System.out.print("Numbers 1 to 100 forwards: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = n;
            n += 1;
            System.out.print(nums[i] + " ");
        }
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println();
        System.out.println("The sum of the numbers in the array is: " + sum);
        System.out.println();
        

/* Part B: Write an accompanying code segment that will output the array in reverse.*/
        
        System.out.println();
        System.out.println("Numbers 100 to 1 backwards: ");
        for (int i = nums.length - 1; i >= 0 ; i--) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}