package for_loop;

import java.util.Scanner;

/*
Write a program to take n numbers from user and calculate their average
*/
public class AverageDemo {
    public static void main(String[] args) {
        int avr, l, n, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        x = 0;
        for (l = 1; l > 0; l++) {
            n = sc.nextInt();
            x += n;
            avr = x / l;
            System.out.println("Average formula -> sum of n [" + x + "] / number of values [" + l + "] = average [" + avr + "]");
        }
    }
}