package for_loop;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int f, n, x, y;
// f = n*(n-1)*(n-2)*...*1;
// x = 1, 2, 3, 4 --> x++;
// y = (n-(x++)).....1 --> y--;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        n = sc.nextInt();
//  --- Birinci üsul x-ə görə:
        f = 1;
        for (x = 1; x <= n; x++) {
            f = f * x; //her defe f-in qiymeti artır
        }
        System.out.println(f);
//  --- Ikinci üsul y-ə görə:
        f = 1;
        for (y = n; y > 0; y--) {
            f *= y;
        }
        System.out.println(f);
    }
}