package for_loop;

import java.util.Scanner;
/*
Write a program to calculate factorial of given number.
*/
public class FactorialDemo {
    public static void main(String[] args) {
        int f, n, x, y;
// f = n*(n-1)*(n-2)*...*1;
// x = 1, 2, 3, 4 --> x++;
// y = (n-(x++)).....1 --> y--;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        n = sc.nextInt();
// first method according to x:
        f = 1;
        for (x = 1; x <= n; x++) {
            f = f * x; //her defe f-in qiymeti artır
        }
        System.out.println(f);
// second method according to y:
        f = 1;
        for (y = n; y > 0; y--) {
            f *= y;
        }
        System.out.println(f);
    }
}