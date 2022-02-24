package LCS;

public class Min_No_Insrt_make_a_Str_Palindrome {
    static int lenLCS(String X, int n, String Y, int m) {
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

    static int lenLPS(String X, int n) {
        StringBuilder sb = new StringBuilder(X);
        sb.reverse();
        String rev_X = sb.toString();
        return lenLCS(X, n, rev_X, n);
    }

    static int min_No_Insrt_make_a_Str_Palindrome(String X, int n) {
        // Logic yaha pe similar he min no. of deletions wale se.
        return n - lenLPS(X, n);
    }

    public static void main(String[] args) {
        System.out.println(min_No_Insrt_make_a_Str_Palindrome("aebcbda",7));
        System.out.println(min_No_Insrt_make_a_Str_Palindrome("aebbda",6));
        System.out.println(min_No_Insrt_make_a_Str_Palindrome("mom",3));
        System.out.println(min_No_Insrt_make_a_Str_Palindrome("love",4));
    }
}
