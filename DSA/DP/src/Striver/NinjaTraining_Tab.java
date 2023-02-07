package Striver;

public class NinjaTraining_Tab {
    public static void main(String[] args) {
        int points[][] = { new int[] { 10, 50, 1 }, new int[] { 5, 100, 11 } };
        int n = points.length;

        System.out.println(ninjaTraining(n, points));
    }

    public static int ninjaTraining(int n, int points[][]) {
        int dp[][] = new int[n][3];
        dp[0][0] = points[0][0];
        dp[0][1] = points[0][1];
        dp[0][2] = points[0][2];

        for (int day = 1; day < n; day++) {
            for (int act = 0; act < 3; act++) {
                int maxPoints;
                if (act == 0) {
                    // pick the day with act 0
                    maxPoints = points[day][0]
                            + Math.max(dp[day - 1][1], dp[day - 1][2]);
                } else if (act == 1) {
                    // pick the day with act 1
                    maxPoints = points[day][1]
                            + Math.max(dp[day - 1][0], dp[day - 1][2]);
                } else {
                    // act == 2
                    // pick the day with act 2
                    maxPoints = points[day][2]
                            + Math.max(dp[day - 1][0], dp[day - 1][1]);
                }

                dp[day][act] = maxPoints;
            }
        }

        return Math.max(dp[n - 1][0], Math.max(dp[n - 1][1], dp[n - 1][2]));
    }
}