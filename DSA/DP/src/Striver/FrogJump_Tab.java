package Striver;

public class FrogJump_Tab {
    public static void main(String[] args) {
        int[] stepE = { 30, 10, 60, 10 };
        int n = 4;

        int dp[] = new int[n];
        dp[0] = 0;

        for (int i = 1; i < n; i++) {
            int oneStepE = dp[i - 1] + Math.abs(stepE[i] - stepE[i - 1]);
            int twoStepE = i > 1 ? dp[i - 2] + Math.abs(stepE[i] - stepE[i - 2]) : Integer.MAX_VALUE;

            dp[i] = Math.min(oneStepE, twoStepE);
        }

        System.out.println(dp[n - 1]);
    }
}
