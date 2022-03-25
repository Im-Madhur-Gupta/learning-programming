package MCM;

public class MCM_Memoized {
    static int dp[][] = new int[1001][1001]; // max constraints ke hisab se matrix bana di.

    public static void main(String[] args) {
        // input
        int arr[] = {40, 20, 30, 10, 30};
        int n = arr.length;

        // init the dp matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        // calling the mcm memoized function
        // init left index is 1 and init right index is n-1.
        System.out.println(mcmMemoized(arr, 1, n - 1));
    }

    static int mcmMemoized(int arr[], int i, int j) {
        if (i >= j) return 0; // base cond

        if (dp[i][j] != -1) return dp[i][j]; // ans already calculated

        int ans = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            // cost for the current subproblem
            int tempAns = mcmMemoized(arr, i, k) + mcmMemoized(arr, k + 1, j) + arr[i - 1] * arr[k] * arr[j];

            // finding min and storing it
            ans = Math.min(ans, tempAns);
        }

        // storing and returning the answer we calculated
        return dp[i][j] = ans;
    }
}
