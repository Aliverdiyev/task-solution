package ifswitch;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String result = (num > 0) ? "The number you entered is positive" :
                (num < 0) ? "The number you entered is negative" :
                        "Enter a positive or negative number";
        System.out.println(result);
    }
}