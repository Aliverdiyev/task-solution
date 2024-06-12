package if_switch;

import java.util.Scanner;

/*
Write a program to check whether a number is even or odd and make sure the number is not zero.
*/
public class EvenOdd {
    public static void main(String[] args) {
// method-1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        if (a % 2 == 0 && a != 0) {
            System.out.println("The number " + a + " is even");
        } else if (a == 0) {
            System.out.println("The number " + a + " is neither odd nor even");
        } else {
            System.out.println("The number " + a + " is odd");
        }

// method-2
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number != 0) {
            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        } else {
            System.out.println("Number cannot be zero.");
        }
        sc.close();

// ternary
        String result = number != 0 ? (number % 2 == 0 ? number + " is even." : number + " is odd.") : "Number cannot be zero.";
        System.out.println(result);
    }
}