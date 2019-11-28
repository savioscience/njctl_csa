/*Write a code segment that will output the letter grade depending on
the score on the test, given the scheme below.
A = 90 - 100
B = 80 - 89
C = 70 - 79
D = 60 - 69
F = < 60*/

import java.util.Scanner;
public class LetterGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What score did you get on the test? ");
        int score = input.nextInt();
        
        if (score >= 90 && score <= 100) {
            System.out.println("Congratulations! A " + score + "% is an A!");
        }
        else if (score >= 80 && score < 90) {
            System.out.println("Good Job! A " + score + "% is a B!");
        }
        else if (score >= 70 && score < 80) {
            System.out.println("A score of " + score + "% is a C");
        }
        else if (score >= 60 && score < 70) {
            System.out.println("A score of " + score + "% is a D");
        }
        else if (score < 60) {
            System.out.println("A score of " + score + "% is an F");
        }
    }
}