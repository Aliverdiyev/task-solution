package if_switch;

import java.util.Scanner;

/*
Write a Java program that takes three numbers from the user(using Scanner) and prints the greatest number.
(use only if  else statements)
*/
public class GreatestNumber {
    public static void main(String[] args) {
//  my method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("The greatest number is: " + a);
        } else if (b > a && b > c) {
            System.out.println("The greatest number is: " + b);
        } else if (c > a && c > b) {
            System.out.println("The greatest number is: " + c);
        } else {
            System.out.println("ERROR");
        }

//  method 2
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();
        int greatest;
        // Check num1 and num2
        if (num1 > num2) {
            greatest = num1;
        } else {
            greatest = num2;
        }
        // Check the current greatest with num3
        if (greatest < num3) {
            greatest = num3;
        }
        System.out.println("The greatest number is: " + greatest);

        // method 3
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt();
        int greatestNumber = Math.max(number1, number2); // Find the greater of num1 and num2
        greatestNumber = Math.max(greatestNumber, number3); // Compare the greater value with num3
        System.out.println("The greatest number is: " + greatestNumber);
        sc.close();
    }
}