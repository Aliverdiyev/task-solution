package ifswitch;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char a = sc.next().charAt(0);
        if ((a == 'a' | a == 'e' | a == 'i' | a == 'o' | a == 'u') || (a == 'A' | a == 'E' | a == 'I' | a == 'O' | a == 'U')) {
            System.out.println(a + " is a vowel.");
        } else
            System.out.println(a + " is a consonant.");
    }
}