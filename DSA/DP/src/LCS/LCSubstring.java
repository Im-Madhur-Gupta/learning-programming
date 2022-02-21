package LCS;

public class LCSubstring {
    static int lcsubstring(String X, int n, String Y, int m) {
        int t[][] = new int[n + 1][m + 1];

        // init
        for (int i = 0; i < n + 1; i++) t[i][0] = 0;
        for (int j = 1; j < m + 1; j++) t[0][j] = 0;

        // processing
        int max = 0; // this variable will store the max len of common sub str
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                // t[i][j] will store the length of common substr AT X[i-1] and Y[j-1].
                // Max length ni hogi, max calc. alag se kar rahe he.
                if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                    max = Math.max(t[i][j], max);
                } else {
                    t[i][j] = 0; // showing that we have got a discontinuity in the substr
                    // so the len of sub str is reset to 0.
                }
            }
        }

        // final result is max
        return max;
    }

    public static void main(String[] args) {
        int n = 4;
        String X = "acdr";
        int m = 4;
        String Y = "aedr";
        System.out.println(lcsubstring(X, n, Y, m));
    }
}
