
import java.util.Scanner;

public class mathProgram {
    public static void main(String[] args) {

        // collects user math problem
        System.out.print("Enter your single operation problem: ");
        Scanner input = new Scanner(System.in);
        String problem = new String(input.nextLine());
        //System.out.print(problem);
        input.close();

        // Extracts 1st number from problem and converts to int
        char temp = problem.charAt(0);
        String a = "0" + temp;
        int first = Integer.parseInt(a);

        // Extracts 2nd number from end of problem and converts to int
        int end = problem.length() - 1;
        temp = problem.charAt(end);
        String b = "0" + temp;
        int second = Integer.parseInt(b);
        double ans = 0;

        // Checks for math symbol and performs operation
        if (problem.contains("+")) {
             ans = (double) (first + second);
        } else if (problem.contains("-")) {
             ans = (double) (first - second);
        } else if (problem.contains("*")) {
             ans = (double) (first * second);
        } else if (problem.contains("/")) {
             ans = (double) (first / second);
        }

        System.out.printf("The solution to " + problem + " is %f!", ans);
    }
}
