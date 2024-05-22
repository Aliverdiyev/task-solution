package for_loop;

public class Task6 {
    public static void main(String[] args) {
        int a, b, c, d;
        d = 0;
        for (a = 1; a <= 4; a++) {
            for (b = 1; b <= 4; b++) {
                for (c = 1; c <= 4; c++) {
                    if ((a != b && a != c) && (b != c)) {
                        d++;
                        System.out.println(a + " " + b + " " + c);
                    }
                }
            }
        }
        System.out.println("Total number of the three-digit-number is: " + d);
    }
}