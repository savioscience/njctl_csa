/*Write a loop to print the numbers from 1 to 100.*/

public class AdditionTable {

    static void setup(){
        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= 5; j++){
                System.out.print(i + j + " ");
            }
        System.out.println();
        }
    }

    public static void main(String[] args) {
        setup();
    }
}