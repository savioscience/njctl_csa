public class MultFive {
    public static void main (String[] args) throws java.io.IOException
    {
        int n, testn;
        System.out.print("Enter in the number to check if it's divisible by 5:  ");
        n = (int) System.in.read();
        testn = n % 5;
        if (n % 5 == 0);
        {
            System.out.println(n + " is divisible by 5.");
        }
        else if (n % 5 != 0);
        {
            System.out.print("testn = " + testn);
        }
    }
}