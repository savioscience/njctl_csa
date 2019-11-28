/* Write a program that inputs and stores a user's name and
initial bank account balance. Then performs the following
actions based on the user's request:
1) Check Balance
2) Deposit money
3) Withdraw money
4) Print Balance */


import java.util.Scanner;

public class AccountBalance {
    static double accountBalance;

    public static void main(String[] args) {
        collectInfo();
        chooseTransaction();
    }

    public static void collectInfo() {
        // collects user information and account balance
        System.out.print("What is your name? ");
        Scanner input = new Scanner(System.in);
        String name = input.next();

        System.out.print("Enter your account balance: ");
        accountBalance = input.nextDouble();
        System.out.println();
        System.out.println("Welcome, " + name + "!");
    }

    public static void chooseTransaction() {
        System.out.println();
        System.out.println("****************************************");
        System.out.println(" Please choose an action from the menu:");
        System.out.println("  Press 1 to check your balance.");
        System.out.println("  Press 2 to deposit money.");
        System.out.println("  Press 3 to withdraw money.");
        System.out.println("  Press 4 to exit.");
        System.out.println("****************************************");
        System.out.println();
        System.out.print("Enter your choice: ");

        Scanner input = new Scanner(System.in);
        String choice = input.next();
        char choose = choice.charAt(0);

        if (choose == '1') {
            checkBalance();
        }
        else if (choose == '2') {
            depositMoney();
        }
        else if (choose == '3') {
            withdrawMoney();
        }
        else if (choose == '4') {
            endTransaction();
        }
        else {
            System.out.println("Invalid choice.");
            chooseTransaction();
        }
    }
    
    public static void checkBalance() {
        System.out.println("You currently have $" + accountBalance + " in your account.");
        System.out.print("Please choose another action from the menu, below.");
        chooseTransaction();
    }

     public static void depositMoney() {
        System.out.print("How much would you like to deposit? $");
        Scanner input = new Scanner(System.in);
        double deposit = input.nextDouble();
        accountBalance += deposit;

        System.out.println("Thank you! $" + deposit + " has been deposited into your account.");
        System.out.print("Please choose another action from the menu, below.");
        chooseTransaction();

      
    }

    public static void withdrawMoney() {
        System.out.print("How much would you like to withdraw? $");
        Scanner input = new Scanner(System.in);
        double withdraw = input.nextDouble();
        accountBalance -= withdraw;

        System.out.println("Thank you! $" + withdraw + " has been withdrawn from your account.");
        System.out.print("Please choose another action from the menu, below.");
        chooseTransaction();
      
    }

    public static void endTransaction() {
        System.out.println("Have a nice day! :-) ");
    }


}
