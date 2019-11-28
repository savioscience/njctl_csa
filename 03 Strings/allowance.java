
import java.util.Scanner;

public class allowance {
    public static void main(String[] args) {

        // collects user math problem
        System.out.print("Enter your base allowance: ");
        Scanner input = new Scanner(System.in);
        String xallowance = input.next();
        input.close();
        int tallow = Integer.parseInt(xallowance);
        tallow += 10;
        System.out.println("Your base weekly allowance is $" + tallow);
    }
}
