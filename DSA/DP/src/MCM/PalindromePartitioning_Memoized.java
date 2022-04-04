package MCM;

public class PalindromePartitioning_Memoized {
    static int dp[][];

    static boolean isPalindrome(String S, int i, int j) {
        while (i < j) {
            if (S.charAt(i) != S.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    static int palindromePartitioningMemoized(String S, int i, int j) {
        // base condition
        if (i >= j) return 0;

        // check whether subproblem is already solved or not
        if (dp[i][j] != -1) return dp[i][j];

        // subproblem wasnt solved already

        // check if palindrome
        if (isPalindrome(S, i, j)) return dp[i][j] = 0;

        int ans = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int tempAns = palindromePartitioningMemoized(S, i, k) + palindromePartitioningMemoized(S, k + 1, j) + 1;
            ans = Math.min(tempAns, ans);
        }

        return dp[i][j] = ans;
    }

    public static void main(String[] args) {
        String S = "nitik";
        int n = S.length();

        // instantiate the dp matrix
        dp = new int[n][n];

        // init the dp matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.print(palindromePartitioningMemoized(S, 0, n - 1));
    }
}
