package for_loop;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int n, pos, neg, zero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        pos = 0;
        neg = 0;
        zero = 0;
        for (; ; ) {
            n = sc.nextInt();
            if (n > 0) {
                n = 1;
                pos += n;
            } else if (n < 0) {
                n = 1;
                neg += n;
            } else if (n == 0) {
                n = 1;
                zero += n;
            }
            System.out.println("Count of positive numbers: " + pos + "; " + "Count of negative numbers: " + neg + "; " + "Count of zero numbers: " + zero);
        }
    }
}