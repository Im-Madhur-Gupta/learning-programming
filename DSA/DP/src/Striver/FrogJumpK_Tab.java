package Striver;

public class FrogJumpK_Tab {
    public static void main(String[] args) {
        int[] stepE = { 30, 10, 60, 10, 20 };
        int n = 4;
        int k = 3;
        // if at ith index step, you can go to i+1, i+2, i+3, ... i+k.

        int dp[] = new int[n + 1];
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            int minStepE = Integer.MAX_VALUE;
            for (int j = 1; j <= k; j++) {
                if (i >= j) {
                    int currStepE = dp[i - j] + Math.abs(stepE[i] - stepE[i - j]);
                    minStepE = Math.min(minStepE, currStepE);
                } else {
                    break;
                }
            }
            dp[i] = minStepE;
        }

        System.out.println(dp[n]);
    }
}
