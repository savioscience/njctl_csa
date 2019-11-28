public class BillTotal
 {/*
                         * public static void main (String[] args) throws java.io.IOException { double
                         * subtotal, tip, tax;
                         * System.out.print("Enter in the subtotal on the dinner bill:  "); subtotal =
                         * (double) System.in.read(); tip = subtotal * 0.18; tax = subtotal * 0.07;
                         * System.out.println("Your total for today is: " + (subtotal + tip + tax)); } }
                         */


    public static void main(String[] args) {
        double bill = 104.75;
        double tax = bill * .07;
        double tip = bill * .18;
        double total = bill + tax;
        System.out.println("Your total bill is: $" + total);
        System.out.print("18% Tip is $" + tip);
    }
}