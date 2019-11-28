/*Write a loop to print the numbers from 1 to 100.*/

public class Sum1to100 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}