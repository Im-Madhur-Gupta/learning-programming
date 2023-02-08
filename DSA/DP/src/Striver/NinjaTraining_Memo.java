package Striver;

public class NinjaTraining_Memo {
    public static void main(String[] args) {
        int points[][] = { new int[] { 10, 50, 1 }, new int[] { 5, 100, 11 } };
        int n = points.length;

        System.out.println(ninjaTraining(n, points));
    }

    public static int ninjaTraining(int n, int points[][]) {
        int dp[][] = new int[n][4];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                dp[i][j] = -1;
            }
        }

        return getMaxPoints(points, n - 1, 3, dp);
    }

    static int getMaxPoints(int points[][], int day, int lastAct, int dp[][]) {
        if (day < 0) {
            return 0;
        }

        if (dp[day][lastAct] != -1)
            return dp[day][lastAct];

        int maxPoints = -1;
        for (int currAct = 0; currAct < 3; currAct++) {
            if (currAct != lastAct) {
                maxPoints = Math.max(maxPoints, points[day][currAct] + getMaxPoints(points, day - 1, currAct, dp));
            }
        }

        return dp[day][lastAct] = maxPoints;
    }
}