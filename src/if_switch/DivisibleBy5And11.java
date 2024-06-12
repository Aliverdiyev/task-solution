package if_switch;

import java.util.Scanner;

/*
Write a program to check whether a number is divisible by 5 and 11 or not
*/
public class DivisibleBy5And11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number % 5 == 0 && number % 11 == 0) {
            System.out.println(number + " is divisible by both 5 and 11.");
        } else {
            System.out.println(number + " is not divisible by 5 and 11.");
        }
        sc.close();
    }
}