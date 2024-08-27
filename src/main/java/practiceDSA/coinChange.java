package practiceDSA;

import java.util.*;

//Input: sum = 4, coins[] = {1,2,3}
//Output: 4
//Explanation: there are four solutions: {1, 1, 1, 1}, {1, 1, 2}, {2, 2} and {1, 3}
public class coinChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[][] dp = new int[n + 1][sum + 1];
        for (int[] row : dp)
            Arrays.fill(row, -1);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(coinsRecursive(arr, n, sum));
        System.out.println(coinDynPr(arr, n, sum, dp));
    }

    //using 2D memo array for memoization Dynamic programming
    //if the same value of dp array gets called more than once, then that is the required value
    public static int coinsRecursive(int[] arr, int n, int sum) {
        if (sum == 0)
            return 1;
        if (sum < 0)
            return 0;
        if (n <= 0)
            return 0;
        return coinsRecursive(arr, n - 1, sum) + coinsRecursive(arr, n, sum - arr[n - 1]);

    }

    public static int coinDynPr(int[] arr, int n, int sum, int[][] dp) {
        if (sum == 0)
            return dp[n][sum] = 1;
        if (n == 0 || sum < 0)
            return 0;
        if (dp[n][sum] != -1)
            return dp[n][sum];

        return dp[n][sum] = coinDynPr(arr, n - 1, sum, dp) + coinDynPr(arr, n, sum - arr[n - 1], dp);
    }

}
