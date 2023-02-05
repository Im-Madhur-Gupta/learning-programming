package Striver;

public class FrogJump_Tab_Opti {
    public static void main(String[] args) {
        int[] stepE = { 30, 10, 60, 10 };
        int n = 3; // 0 based index of final step

        int secPrevStepE = 0;
        int prevStepE = 0;

        for (int i = 1; i <= n; i++) {
            int oneStepE = prevStepE + Math.abs(stepE[i] - stepE[i - 1]);
            int twoStepE = i > 1 ? secPrevStepE + Math.abs(stepE[i] - stepE[i - 2]) : Integer.MAX_VALUE;

            secPrevStepE = prevStepE;
            prevStepE = Math.min(oneStepE, twoStepE); // ith index answer
        }

        System.out.println(prevStepE); // n-1 index ka answer
    }
}
