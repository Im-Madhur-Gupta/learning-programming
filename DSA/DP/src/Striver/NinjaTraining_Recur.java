package Striver;

public class NinjaTraining_Recur {
    public static void main(String[] args) {
        int points[][] = { new int[] { 10, 50, 1 }, new int[] { 5, 100, 11 } };
        int n = points.length;

        System.out.println(ninjaTraining(n, points));
    }

    public static int ninjaTraining(int n, int points[][]) {
        return Math.max(getMaxPoints(points, n-1, 0), Math.max(getMaxPoints(points, n-1, 1), getMaxPoints(points, n-1, 2)));
    }

    // activity to be done on day -> act
    static int getMaxPoints(int points[][], int day, int act) {
        if (day < 0) {
            return 0;
        }

        int maxPoints;
        if (act == 0) {
            // pick the day with act 0
            maxPoints = points[day][0] + Math.max(getMaxPoints(points, day - 1, 1), getMaxPoints(points, day - 1, 2));
        } else if (act == 1) {
            // pick the day with act 1
            maxPoints = points[day][1] + Math.max(getMaxPoints(points, day - 1, 0), getMaxPoints(points, day - 1, 2));
        } else {
            // act == 2
            // pick the day with act 2
            maxPoints = points[day][2] + Math.max(getMaxPoints(points, day - 1, 0), getMaxPoints(points, day - 1, 1));
        }

        return maxPoints;
    }
}