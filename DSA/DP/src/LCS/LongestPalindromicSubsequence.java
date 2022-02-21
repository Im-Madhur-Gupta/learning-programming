package LCS;

public class LongestPalindromicSubsequence {
    static int lenLCS(String X, int n, String Y, int m) {
        int t[][] = new int[n + 1][m + 1];

        // init
        // 0th row, 0th col ko 0s se bhardo.
        for (int i = 0; i < n + 1; i++) t[i][0] = 0;
        for (int j = 1; j < m + 1; j++) t[0][j] = 0;

        // processing
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(X.charAt(i-1)==Y.charAt(j-1)){
                    t[i][j] = 1+t[i-1][j-1];
                }
                else{
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }

        return t[n][m];
    }

    static int longestPalindromicSubsequence(String X, int n) {
        // logic ye he ki agr a, rev(a) ke beech LCS nikala to ye LCS actually palindrome hoga
        // So, mera LCS Palindrome he --> ye Longest Palindromic Subsequence he.
        StringBuilder sb = new StringBuilder(X);
        sb.reverse();
        String rev_X = sb.toString();
        return lenLCS(X,n,rev_X,n);
    }

    public static void main(String[] args) {
        System.out.println(longestPalindromicSubsequence("agbcba",6));
    }
}
