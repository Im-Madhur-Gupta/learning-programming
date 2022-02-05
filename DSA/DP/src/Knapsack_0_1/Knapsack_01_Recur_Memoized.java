package Knapsack_0_1;

import java.util.Arrays;

public class Knapsack_01_Recur_Memoized {
    static int t[][] = new int[102][1002];

    public static int knapsack(int wt[], int val[], int n, int w) {
        // base condition
        if (n == 0 || w == 0) return 0;

        // If this case has already been processed then simply return the stored val.
        if (t[n][w] != -1) return t[n][w];

        // If value has NOT been processed earlier, then we have to process it and then store it.
        if (wt[n - 1] <= w) {
            // We still have space left in the knapsack
            t[n][w] = Math.max(val[n - 1] + knapsack(wt, val, n - 1, w - wt[n - 1]), knapsack(wt, val, n - 1, w));
        } else {
            // We don't have space left in our knapsack
            t[n][w] = knapsack(wt, val, n - 1, w);
        }
        return t[n][w]; // finally, return the processed val.
    }

    public static void main(String[] args) {
        // Inititalizing my DP matrix with -1
        for (int row[] : t) {
            Arrays.fill(row, -1);
        }

        System.out.println(knapsack(new int[]{1, 3, 5}, new int[]{2, 1, 4}, 3, 6));
    }
}
