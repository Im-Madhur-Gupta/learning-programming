package Striver;

public class FrogJumpK_Memo {
    public static void main(String[] args) {
        int[] stepE = { 30, 10, 60, 10, 20 };
        int n = 4;
        int k = 3;
        // if at ith index step, you can go to i+1, i+2, i+3, ... i+k.

        int dp[] = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            dp[i] = -1;
        }

        System.out.println(getMinE(stepE, dp, k, n));
    }

    static int getMinE(int stepE[], int dp[], int k, int n) {
        if (n == 0)
            return 0;

        if (dp[n] != -1)
            return dp[n];

        int minStepE = Integer.MAX_VALUE;
        for (int i = 1; i <= k; i++) {
            int currStepE = n >= i ? getMinE(stepE, dp, k, n - i) + Math.abs(stepE[n] - stepE[n - i])
                    : Integer.MAX_VALUE;
            minStepE = Math.min(minStepE, currStepE);
        }

        return dp[n] = minStepE;
    }
}
