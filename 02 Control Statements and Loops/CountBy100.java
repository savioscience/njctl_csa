/*Count by 100s and print each value between 0 and
10,000, with each number on a new line.*/

public class CountBy100 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 10000) {
            System.out.println(i + " ");
            i += 100;
        }
    }
}