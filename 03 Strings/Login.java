import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        // collects username input
        System.out.print("Choose a username: ");
        Scanner input = new Scanner(System.in);
        String user = new String(input.next());

        // collects password input
        System.out.print("Choose a password: ");
        input = new Scanner(System.in);
        String pswd = new String(input.next());

        // This segment collects verify password input
        System.out.print("Please verify the password: ");
        input = new Scanner(System.in);
        String verify = new String(input.next());

        input.close();

        //This statement will compare passwords.
        if (pswd.compareTo(verify) == 0) {
            System.out.println("Password verify");
        }
        else{
            System.out.println("passwords do not match");
        }
    }
}