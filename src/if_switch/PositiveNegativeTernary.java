package if_switch;

import java.util.Scanner;

/*
Write a Java program to get a number from the user (using Scanner) and print whether it is positive or negative. (use ternary operator)
*/
public class PositiveNegativeTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String result = (number > 0) ? "The number is positive." :
                (number < 0) ? "The number is negative." :
                        "The number is zero.";

        System.out.println(result);
        scanner.close();
    }
}