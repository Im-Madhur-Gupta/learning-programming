package Striver;

public class MaxSumOfSubSeqNoAdjEle_Memo {
    public static void main(String[] args) {
        int mainSeq[] = { 2, 1, 4, 9 };
        int n = mainSeq.length;

        int dp[] = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = -1;
        }

        maxSumOfSubSeqNoAdjEle(mainSeq, n, dp, n - 1);
        System.out.println(dp[n - 1]);
    }

    // assume elements in the array are non-neg integers
    static int maxSumOfSubSeqNoAdjEle(int mainSeq[], int size, int[] dp, int i) {
        if (i < 0)
            return 0;
        if (i == 0)
            return mainSeq[0];

        if (dp[i] != -1)
            return dp[i];

        int pickSum = mainSeq[i] + maxSumOfSubSeqNoAdjEle(mainSeq, size, dp, i - 2);
        int notPickSum = maxSumOfSubSeqNoAdjEle(mainSeq, size, dp, i - 1);

        return dp[i] = Math.max(pickSum, notPickSum);
    }
}
