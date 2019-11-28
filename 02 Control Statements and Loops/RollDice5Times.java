/*Write a loop to compute the sum of the even numbers from 2
to 20.*/

public class RollDice5Times {
    public static void main(String[] args) {
        int sumsides = 0;
        for (int roll = 1; roll <= 5; roll++){
            int diceSideUp = (int) Math.floor(Math.random() * 6 + 1);
            sumsides += diceSideUp;
            System.out.println(diceSideUp);
        }
        System.out.println("The sum of the rolls is: " + sumsides);
    }
}