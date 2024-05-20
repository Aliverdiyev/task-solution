package do_while;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            int l = n % 10;
            n /= 10;
            sum++;
            System.out.println(l);
        }
        System.out.println("reqemlerin sayi: " + sum);
    }
}