package practiceDSA;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

class rotateArray {

    // Function to rotate array
    static void rotateArrays(int @NotNull [] arr, int d) {
        int n = arr.length;
        d = d % n;
        int[] temp = new int[n];
        int k = 0, i = 0;
        for (i = d; i < n; i++) {
            temp[k++] = arr[i];
        }
        for (i = 0; i < d; i++) {
            temp[k++] = arr[i];
        }
        for (i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        rotateArrays(arr, d);
        System.out.println(Arrays.toString(arr));
    }
}

