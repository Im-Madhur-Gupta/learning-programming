package Striver;

public class NinjaTraining_Tab {
    public static void main(String[] args) {
        int points[][] = { new int[] { 10, 50, 1 }, new int[] { 5, 100, 11 } };
        int n = points.length;

        System.out.println(ninjaTraining(n, points));
    }

    public static int ninjaTraining(int n, int points[][]) {
        int dp[][] = new int[n][3];
        dp[0][0] = Math.max(points[0][1], points[0][2]);
        dp[0][1] = Math.max(points[0][0], points[0][2]);
        dp[0][2] = Math.max(points[0][0], points[0][1]);

        for (int day = 1; day < n; day++) {
            int maxPoints[] = new int[3];
            for (int currAct = 0; currAct < 3; currAct++) {
                maxPoints[currAct] = points[day][currAct] + dp[day - 1][currAct];
            }
            dp[day][0] = Math.max(maxPoints[1], maxPoints[2]);
            dp[day][1] = Math.max(maxPoints[0], maxPoints[2]);
            dp[day][2] = Math.max(maxPoints[0], maxPoints[1]);
        }

        return Math.max(dp[n - 1][0], Math.max(dp[n - 1][1], dp[n - 1][2]));
    }
}