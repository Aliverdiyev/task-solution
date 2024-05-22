package for_loop;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        x = sc.nextInt();
        for (y = 1; y <= x; y++) {
            System.out.println(x + "*" + y + "=" + x * y);
        }
    }
}