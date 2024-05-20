package ifswitch;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
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
    }
}