package MCM;

public class EvaluateBoolExpToTrue_Memoized {
    // dp matrix
    static int dp[][][];

    static int calcAnsAccToOperator(int lT, int lF, int rT, int rF, char operator, boolean outcome) {
        int ans = 0;
        // AND operator
        if (operator == '&') {
            if (outcome) {
                ans = lT * rT;
            } else {
                ans = lT * rF + lF * rT + lF * rF;
            }
        } else if (operator == '|') {
            if (outcome) {
                ans = lT * rF + lF * rT + lT * rT;
            } else {
                ans = lF * rF;
            }
        } else if (operator == '^') {
            if (outcome) {
                ans = lT * rF + lF * rT;
            } else {
                ans = lT * rT + lF * rF;
            }
        }
        return ans;
    }

    // Memoized Code
    static int waysToEvaluateBoolExpToOutcome(String s, int i, int j, boolean outcome) {
        // base condition
        if (i > j) return 0;
        if (i == j) {
            if (outcome) {
                return s.charAt(i) == 'T' ? 1 : 0;
            } else {
                return s.charAt(i) == 'F' ? 1 : 0;
            }
        }

        // checking whether ans is already calculated
        int outcomeIndex = outcome ? 1 : 0;
        if (dp[i][j][outcomeIndex] != -1) {
            return dp[i][j][outcomeIndex];
        }

        // if ans wasn't found then recursively calculate it
        // REMEMBER -> k index should always be on an operator
        int ans = 0;
        for (int k = i + 1; k < j; k += 2) {
            int lT = waysToEvaluateBoolExpToOutcome(s, i, k - 1, true);
            int lF = waysToEvaluateBoolExpToOutcome(s, i, k - 1, false);
            int rT = waysToEvaluateBoolExpToOutcome(s, k + 1, j, true);
            int rF = waysToEvaluateBoolExpToOutcome(s, k + 1, j, false);

            ans += calcAnsAccToOperator(lT, lF, rT, rF, s.charAt(k), outcome);
        }

        return dp[i][j][outcomeIndex] = ans;
    }

    public static void main(String[] args) {
        String s = "T|T&F^T";
        int n = s.length();

        dp = new int[n + 1][n + 1][2];

        // Note - For last index 0->false, 1->true 

        // init the dp matrix
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                dp[i][j][0] = -1;
                dp[i][j][1] = -1;
            }
        }

        System.out.println(waysToEvaluateBoolExpToOutcome(s, 0, n - 1, true));
    }
}
