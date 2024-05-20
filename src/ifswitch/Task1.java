package ifswitch;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double num = sc.nextDouble();
        if (num > 0) {
            System.out.println("The number you entered is positive");
        } else if (num < 0) {
            System.out.println("The number you entered is negative");
        } else {
            System.out.println("Enter a positive or negative number");
        }
    }
}