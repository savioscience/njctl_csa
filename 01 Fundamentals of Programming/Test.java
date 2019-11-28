import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your first name? ");
        String fname = input.nextLine();
        
        System.out.print("What is your last name? ");
        String lname = input.nextLine();

        System.out.print(fname + " " + lname);
    }
}