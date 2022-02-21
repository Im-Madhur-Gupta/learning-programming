package LCS;

public class Min_Dels_to_make_a_Str_Palindrome {
    static int len_LCS(String X, int n, String Y, int m) {
        // LCS - Longest Common Subsequence
        int t[][] = new int[n + 1][m + 1];

        for (int i = 0; i < n + 1; i++) t[i][0] = 0;
        for (int j = 1; j < m + 1; j++) t[0][j] = 0;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }

        return t[n][m];
    }

    static int len_LPS(String X, int n) {
        // LPS - Longest Palindromic Subsequence
        // LPS(X) = LCS(X, rev(X))

        StringBuilder sb = new StringBuilder(X);
        sb.reverse();
        String rev_X = sb.toString();

        return len_LCS(X, n, rev_X, n);
    }

    static int min_Dels_to_make_a_Str_Palindrome(String X, int n) {
        // longest possible palindrome out of X is basically LPS(X).
        // Agr mai len(X) - LPS(X) kardu to ye basically utne MIN. chars ho jaenge
        // jo mujhe X mai se remove karne he to make it the longest possible palindrome.

        return n - len_LPS(X, n);
    }

    public static void main(String[] args) {
        System.out.println(min_Dels_to_make_a_Str_Palindrome("aebcbda", 7));
        System.out.println(min_Dels_to_make_a_Str_Palindrome("agbcba", 6));
    }
}
