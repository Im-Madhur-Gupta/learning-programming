package Striver;

public class FrogJumpK_Recur {
    public static void main(String[] args) {
        int[] stepE = { 30, 10, 60, 10, 20 };
        int n = 4;
        int k = 3;
        // if at ith index step, you can go to i+1, i+2, i+3, ... i+k.
        System.out.println(getMinE(stepE, k, n));
    }

    static int getMinE(int stepE[], int k, int n) {
        if (n == 0)
            return 0;

        int minStepE = Integer.MAX_VALUE;
        for (int i = 1; i <= k; i++) {
            int currStepE = n >= i ? getMinE(stepE, k, n - i) + Math.abs(stepE[n] - stepE[n - i]) : Integer.MAX_VALUE;
            minStepE = Math.min(minStepE, currStepE);
        }

        return minStepE;
    }
}
