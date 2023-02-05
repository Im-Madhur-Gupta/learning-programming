package Striver;

public class FrogJump_Mem {
    public static void main(String[] args) {
        int[] stepE = { 30, 10, 60, 10 };
        int n = 4;

        int dp[] = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = -1;
        }

        System.out.println(getMinE(stepE, dp, n - 1));
    }

    static int getMinE(int stepE[], int dp[], int n) {
        if (n == 0)
            return 0;

        if (dp[n] != -1)
            return dp[n];

        int oneStepE = getMinE(stepE, dp, n - 1) + Math.abs(stepE[n] - stepE[n - 1]);
        int twoStepE = n > 1 ? getMinE(stepE, dp, n - 2) + Math.abs(stepE[n] - stepE[n - 2]) : Integer.MAX_VALUE;

        return dp[n] = Math.min(oneStepE, twoStepE);
    }
}
