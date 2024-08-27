package practiceDSA;

import org.jetbrains.annotations.NotNull;

public class quickSort {
    public static int partition(int @NotNull [] arr, int low, int high) {
        int i = (low - 1);

        int pivot = arr[high];
        for (int j = low; j < high; j++)
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    public static void swap(int @NotNull [] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSorting(int[] arr, int low, int high) {
        if (low < high) {
            // is now at right place
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSorting(arr, low, pi - 1);
            quickSorting(arr, pi + 1, high);
        }
    }

    public static void printArr(int @NotNull [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Driver Code
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int N = arr.length;

        // Function call
        quickSorting(arr, 0, N - 1);
        System.out.println("Sorted array:");
        printArr(arr);
    }

}
