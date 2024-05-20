package practise;

public class Bubble {
    public static void main(String[] args) {
        Bubble sort = new Bubble();
        int[] barr = {12, 13, 16, 15, 22, 20, 17};
        int n = barr.length;
        sort.bubbleSort(barr, n);
        System.out.println("Sorted array: ");
        sort.printArray(barr, n);
    }

    public void bubbleSort(int arr[], int n) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }

    // Function to print an array
    public void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}