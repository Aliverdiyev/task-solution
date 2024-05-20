package do_while;

public class Task10 {
    public static void main(String[] args) {
        Task10 sequence = new Task10();
        System.out.println(sequence.increasing(6, 2, 3, 4));
    }

    public boolean increasing(int a, int b, int c, int d) {
        return a < b && a < c && a < d && b < c && b < d && c < d;
    }
}