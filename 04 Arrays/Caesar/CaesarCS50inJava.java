/* write a program called caesar that enables you to encrypt messages using Caesar’s cipher. 
At the time the user executes the program, they should decide, by providing a 
command-line argument, on what the key should be in the secret message they’ll provide 
at runtime. We shouldn’t necessarily assume that the user’s key is going to be a number; 
though you may assume that, if it is a number, it will be a positive integer. */

import java.util.Scanner;

public class CaesarCS50inJava {
    public static void main(String[] args) {
        System.out.println("Enter in the message you want ciphered: ");
        Scanner input = new Scanner(System.in);
        String unencrypted = input.nextLine();

        int key = readKey();
        int cipherChar = 0;

        int lenofword = unencrypted.length();
        char[] n = new char[lenofword];
        char[] c = new char[lenofword];
        for (int i = 0; i < n.length; i++) {
            n[i] = unencrypted.charAt(i);
        }

        System.out.println();

        for (int k = 0; k < n.length; k++) {
            cipherChar = (int) n[k];

            if ((cipherChar > 64) && (cipherChar < 91)) {
                cipherChar = (n[k] + key);
                if ((cipherChar >= 91) && (cipherChar < 96)) {
                    cipherChar = (n[k] + key) - 26;
                }
            }

            else if ((cipherChar > 96) && (cipherChar < 123)) {
                cipherChar = (n[k] + key);
                if (cipherChar >= 123) {
                    cipherChar = (n[k] + key) - 26;
                }
            }
            c[k] = (char) cipherChar;
        }
        System.out.print(c);
        input.close();
    }

    static int readKey() {
        System.out.println("how many spaces you want to shift the letters? ");
        Scanner input = new Scanner(System.in);
        int key = input.nextInt();
        return key;
    }
}
