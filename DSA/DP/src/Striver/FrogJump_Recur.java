package Striver;

public class FrogJump_Recur {
    public static void main(String[] args) {
        int[] stepE = { 30, 10, 60, 10 };
        int n = 4;
        System.out.println(getMinE(stepE, n - 1));
    }

    static int getMinE(int stepE[], int n) {
        if (n == 0)
            return 0;

        int oneStepE = getMinE(stepE, n - 1) + Math.abs(stepE[n] - stepE[n - 1]);
        int twoStepE = n > 1 ? getMinE(stepE, n - 2) + Math.abs(stepE[n] - stepE[n - 2]) : Integer.MAX_VALUE;
        
        return Math.min(oneStepE, twoStepE);
    }
}
