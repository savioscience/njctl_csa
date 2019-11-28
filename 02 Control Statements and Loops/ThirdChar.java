/*Print every third character between z and a.*/

public class ThirdChar {
    public static void main(String[] args) {
        char z = 'z';
        while (z >= 'a') {
            System.out.print(z + " ");
            z -= 3;
        }
    }
}