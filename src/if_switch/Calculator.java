package if_switch;

import java.util.Scanner;

/*
Write a Java program that takes two numbers and prints out the sum (addition), multiply, subtract, divide and remainder
of two numbers only for positive numbers and in case of division and remainder checks whether second number is not zero
*/
public class Calculator {
    public static void main(String[] args) {
// method-1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        if (b != 0) {
            System.out.println(a / b);
            System.out.println(a % b);
        }

// method-2
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Error: Please enter only positive numbers.");
        } else {
            // Perform calculations
            int sum = num1 + num2;
            int difference = num1 - num2;
            int product = num1 * num2;
            double quotient = (double) num1 / num2; // Cast to double for decimal division
            int remainder = num1 % num2;
            System.out.println("Sum: " + sum);
            System.out.println("Product: " + product);
            System.out.println("Difference: " + difference);
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
        }
        sc.close();
    }
}