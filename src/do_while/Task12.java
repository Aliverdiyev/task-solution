package do_while;

public class Task12 {

    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5 - i; j++) {
                System.out.print(" "); // soldan bosluq
            }
            for (j = i; j >= 1; j--) {
                System.out.print(j);  // sol teref
            }
            for (j = 2; j <= i; j++) {
                System.out.print(j);  // sag teref
            }
            System.out.println();
        }
    }
}