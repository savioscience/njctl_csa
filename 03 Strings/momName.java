import java.util.Scanner;

public class momName {
    public static void main(String[] args) {

        // collects username input
        System.out.print("What is your mother's name first name? ");
        Scanner input = new Scanner(System.in);
        String yourMother = new String(input.next());

        input.close();

        //This statement will compare names.
        if (yourMother.equals("Chloe")) {
            System.out.println("My mother has the same name.");
        }
        else{
            System.out.println("My mother does not have the same name.");
        }
    }
}