package Striver;

// t - O(n), s - O(n)
public class Fibonacci_Tab {
    public static void main(String[] args) {
        int n = 5;

        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println(dp[n]);
    }
}
