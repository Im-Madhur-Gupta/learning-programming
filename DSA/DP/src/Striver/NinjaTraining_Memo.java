package Striver;

public class NinjaTraining_Memo {
    public static void main(String[] args) {
        int points[][] = { new int[] { 10, 50, 1 }, new int[] { 5, 100, 11 } };
        int n = points.length;

        System.out.println(ninjaTraining(n, points));
    }

    public static int ninjaTraining(int n, int points[][]) {
        int dp[][] = new int[n][3];
        for (int i = 0; i < n; i++) {
            dp[i][0] = -1;
            dp[i][1] = -1;
            dp[i][2] = -1;
        }

        return Math.max(getMaxPoints(points, n - 1, 0, dp),
                Math.max(getMaxPoints(points, n - 1, 1, dp), getMaxPoints(points, n - 1, 2, dp)));
    }

    // activity to be done on day -> act
    static int getMaxPoints(int points[][], int day, int act, int[][] dp) {
        if (day < 0) {
            return 0;
        }

        if (dp[day][act] != -1)
            return dp[day][act];

        int maxPoints;
        if (act == 0) {
            // pick the day with act 0
            maxPoints = points[day][0]
                    + Math.max(getMaxPoints(points, day - 1, 1, dp), getMaxPoints(points, day - 1, 2, dp));
        } else if (act == 1) {
            // pick the day with act 1
            maxPoints = points[day][1]
                    + Math.max(getMaxPoints(points, day - 1, 0, dp), getMaxPoints(points, day - 1, 2, dp));
        } else {
            // act == 2
            // pick the day with act 2
            maxPoints = points[day][2]
                    + Math.max(getMaxPoints(points, day - 1, 0, dp), getMaxPoints(points, day - 1, 1, dp));
        }

        return dp[day][act] = maxPoints;
    }
}