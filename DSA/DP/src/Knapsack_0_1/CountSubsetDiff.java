package Knapsack_0_1;

public class CountSubsetDiff {
    // Note - Count Subset Diff problem is same as Target Sum problem.
    static int countSubsetDiff(int arr[], int diff) {
        // Slight variation of count subsets of a given sum.
        int sum = 0;
        for (int i : arr) sum += i;

        int subsetSum = (diff + sum) / 2;
        return countSubsetSum(arr, subsetSum);
    }

    static int countSubsetSum(int arr[], int sum) {
        int n = arr.length;
        int t[][] = new int[n + 1][sum + 1];

        for (int i = 0; i < n + 1; i++) t[i][0] = 1;
        for (int j = 1; j < sum + 1; j++) t[0][j] = 0;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i - 1][j - arr[i - 1]] + t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t[n][sum];
    }

    public static void main(String[] args) {
        System.out.println(countSubsetDiff(new int[]{1, 1, 3, 2}, 1));
    }
}
