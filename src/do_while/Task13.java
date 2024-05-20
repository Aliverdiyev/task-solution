package do_while;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Task13 findHcf = new Task13();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        findHcf.hcfM(sc.nextInt(), sc.nextInt());
    }

    public void hcfM(int a, int b) {
        int hcf = 0;
        for (int i = 1; i <= a || i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                hcf = i;
        }
        System.out.println("HCF of given two numbers is: " + hcf);
    }
}