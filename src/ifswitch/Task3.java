package ifswitch;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b & a > c) {
            System.out.println("The greatest number is: " + a);
        } else if (b > a & b > c) {
            System.out.println("The greatest number is: " + b);
        } else if (c > a & c > b) {
            System.out.println("The greatest number is: " + c);
        } else {
            System.out.println("ERROR");
        }
    }
}