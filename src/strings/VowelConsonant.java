package strings;

import java.util.Scanner;

/*
Write a program to input any alphabet and check whether it is vowel or consonant
*/
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char ch = sc.next().charAt(0); // Get the first character from the input
        ch = Character.toLowerCase(ch); // Convert the character to lowercase for case-insensitive check
        if (ch >= 'a' && ch <= 'z') { // Check if it's a valid alphabet
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter an alphabet.");
        }
        sc.close();
    }
}