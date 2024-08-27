package practiceDSA;
//find minimum number of swaps needed to sort an array
// ith element should have a node till jth element which is in hashmap arr[i] should store j or arr[j] should store i
//cumulative of cycle_size-1 for each node is the net number of swaps necessary
//greedy algo

import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.*;

public class minNumSwaps {
    public static int minSwaps(int @NotNull [] arr) {
        int len = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        for (i = 0; i < len; i++)
            map.put(arr[i], i);
        Arrays.sort(arr);
        boolean[] visited = new boolean[len];
        Arrays.fill(visited, false);
        int ans = 0;
        for (i = 0; i < len; i++) {
            if (visited[i] || map.get(arr[i]) == i)
                continue;
            int j = i, cycle_size = 0;
            while (!visited[j]) {
                visited[j] = true;
                cycle_size++;
                j = map.get(arr[j]);

            }
            if (cycle_size > 0)
                ans += cycle_size - 1;


        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 4, 3, 2};

        System.out.println(minSwaps(a));
    }
}
