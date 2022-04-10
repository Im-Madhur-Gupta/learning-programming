package MCM;

public class EvaluateBoolExpToTrue_Recur {
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

    // kitne tareeko se aise parentisization kar sakte he from i to j such that given expression given outcome de
    static int waysToEvaluateBoolExpToOutcome(String s, int i, int j, boolean outcome) {
        // base condition
        if (i > j) return 0; // string ki length hi 0 he
        if (i == j) { // string ki length 1 he
            // True outcome chahiye agr
            if (outcome) return s.charAt(i) == 'T' ? 1 : 0;
                // False outcome chahiye agr
            else return s.charAt(i) == 'F' ? 1 : 0;
        }

        // k loop
        // remember, k index should always be on a operator
        int ans = 0;
        for (int k = i + 1; k < j; k += 2) {
            int lT = waysToEvaluateBoolExpToOutcome(s, i, k - 1, true);
            int lF = waysToEvaluateBoolExpToOutcome(s, i, k - 1, false);
            int rT = waysToEvaluateBoolExpToOutcome(s, k + 1, j, true);
            int rF = waysToEvaluateBoolExpToOutcome(s, k + 1, j, false);

            // calc temp ans according to the operator we have at curent k and outcome we want
            ans += calcAnsAccToOperator(lT, lF, rT, rF, s.charAt(k), outcome);
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "T|T&F^T";
        int n = s.length();
        System.out.println(waysToEvaluateBoolExpToOutcome(s, 0, n - 1, true));
    }
}
