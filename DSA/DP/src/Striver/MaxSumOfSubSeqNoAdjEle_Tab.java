package Striver;

public class MaxSumOfSubSeqNoAdjEle_Tab {
    public static void main(String[] args) {
        int mainSeq[] = { 2, 1, 4, 9 };
        int n = mainSeq.length;

        int dp[] = new int[n];
        dp[0] = mainSeq[0];

        // assume elements in the array are non-neg integers
        for (int i = 1; i < n; i++) {
            int pickSum = mainSeq[i] + (i > 1 ? dp[i - 2] : 0);
            int notPickSum = dp[i - 1];

            dp[i] = Math.max(pickSum, notPickSum);
        }

        System.out.println(dp[n - 1]);
    }
}
