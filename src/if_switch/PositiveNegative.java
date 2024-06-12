package if_switch;

import java.util.Scanner;
/*
Write a Java program to get a number from the user(using Scanner)  and print whether it is positive or negative.
/(use only if  else statements)
*/

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        scanner.close();
    }
}