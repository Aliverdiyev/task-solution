package do_while;
/*
Write a program to reverse an array
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
//        first method
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + ", ");
        System.out.println();
//        second method
        for (int i = arr.length; i > 0; i--)
            System.out.print(arr[i - 1] + ", ");
    }
}